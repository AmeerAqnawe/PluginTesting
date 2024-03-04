package testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
        Mockito.when(baseRateProvider.getBaseRate()).thenReturn(5.0);
        double adjustedRate = PaymentService.calculateInterestRateAdjustment(200000, 650, 10, baseRateProvider);
        Assertions.assertEquals(6.25, adjustedRate);
    }

    @Test
     void testCalculateInterestRateAdjustment_InvalidParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> PaymentService.calculateInterestRateAdjustment(-1, 650, 10, baseRateProvider));
    }

    @Test
     void testMakePayment_Successful() {
        Mockito.when(bankService.hasSufficientFunds(ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble())).thenReturn(true);
        Mockito.when(bankService.processPayment(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble())).thenReturn(true);
        assertTrue(paymentService.makePayment("fromAccount", "toAccount", 100.0));
    }

    @Test
     void testMakePayment_InsufficientFunds() {
        Mockito.when(bankService.hasSufficientFunds(ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble())).thenReturn(false);
        assertFalse(paymentService.makePayment("fromAccount", "toAccount", 100.0));
    }

    @Test
     void testMakePayment_NegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> paymentService.makePayment("fromAccount", "toAccount", -100.0));
    }
}
