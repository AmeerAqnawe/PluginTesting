package org.testify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class PaymentServiceTest {
    PaymentService paymentService = new PaymentService(new BankService());
    BaseRateProvider baseRateProvider = mock(BaseRateProvider.class);
    @Test
    public void calculateInterestRateAdjustmentCreditScore800() {
        assertEquals(0.75, PaymentService.calculateInterestRateAdjustment(10000, 800, 2, baseRateProvider));
    }

    @Test
    public void calculateInterestRateAdjustmentCreditScore600() {
        assertEquals(1.75, PaymentService.calculateInterestRateAdjustment(10000, 600, 2, baseRateProvider));
    }

    @Test
    public void calculateInterestRateAdjustmentCreditScore400() {
        assertEquals(2.25, PaymentService.calculateInterestRateAdjustment(10000, 400, 2, baseRateProvider));
    }

    @Test
    public void calculateInterestRateAdjustmentCreditScore745() {
        assertEquals(1.25, PaymentService.calculateInterestRateAdjustment(10000, 745, 2, baseRateProvider));
    }

    @Test
    public void calculateInterestRateAdjustmentLongTermLoan() {
        assertEquals(0.5, PaymentService.calculateInterestRateAdjustment(10000, 800,15, baseRateProvider));
    }

    @Test
    public void makePaymentTest() {
        assertTrue(paymentService.makePayment("1122", "2211", 10));
    }
}
