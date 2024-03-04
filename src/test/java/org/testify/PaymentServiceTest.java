package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PaymentServiceTest {

    @Mock
    private BankService bankService;

    @Mock
    private BaseRateProvider baseRateProvider;

    @InjectMocks
    private PaymentService paymentService;

    @BeforeEach
     void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
     void testCalculateInterestRateAdjustment_ValidParameters() {
        when(baseRateProvider.getBaseRate()).thenReturn(5.0);
        double adjustedRate = PaymentService.calculateInterestRateAdjustment(200000, 650, 10, baseRateProvider);
        assertEquals(6.25, adjustedRate);
    }

    @Test
     void testCalculateInterestRateAdjustment_InvalidParameters() {
        assertThrows(IllegalArgumentException.class, () -> PaymentService.calculateInterestRateAdjustment(-1, 650, 10, baseRateProvider));
    }

    @Test
     void testMakePayment_Successful() {
        when(bankService.hasSufficientFunds(anyString(), anyDouble())).thenReturn(true);
        when(bankService.processPayment(anyString(), anyString(), anyDouble())).thenReturn(true);
        assertTrue(paymentService.makePayment("fromAccount", "toAccount", 100.0));
    }

    @Test
     void testMakePayment_InsufficientFunds() {
        when(bankService.hasSufficientFunds(anyString(), anyDouble())).thenReturn(false);
        assertFalse(paymentService.makePayment("fromAccount", "toAccount", 100.0));
    }

    @Test
     void testMakePayment_NegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> paymentService.makePayment("fromAccount", "toAccount", -100.0));
    }
}
