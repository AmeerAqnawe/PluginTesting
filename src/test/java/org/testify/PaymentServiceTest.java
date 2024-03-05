package org.testify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class PaymentServiceTest {
    PaymentService paymentService = new PaymentService(new BankService());
    BaseRateProvider baseRateProvider = mock(BaseRateProvider.class);
    @Test
    public void calculateInterestRateAdjustmentCreditScore800() {
        assertEquals(0.75, PaymentService.calculateInterestRateAdjustment(10000, 800, 2, baseRateProvider));
    }

    @Test
    public void calculateInterestRateAdjustmentcreditScore600() {
        assertEquals(1.75, PaymentService.calculateInterestRateAdjustment(10000, 600, 2, baseRateProvider));
    }

    @Test
    public void calculateInterestRateAdjumentCreditScore400() {
        assertEquals(2.25, PaymentService.calculateInterestRateAdjustment(10000, 400, 2, baseRateProvider));
    }
}
