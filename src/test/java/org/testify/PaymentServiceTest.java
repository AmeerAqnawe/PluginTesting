package org.testify;

import org.junit.jupiter.api.Test;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PaymentServiceTest {

    @Test
    void calculateInterestRateAdjustment() {
        double result = PaymentService.calculateInterestRateAdjustment(10000,500,2, new BaseRateProvider() {
            @Override
            public double getBaseRate() {
                return 0.1;
            }
        });
        assertEquals(2.35,result);
    }

    @Test
    void makePayment() {
        BankService bankService = new BankService();
        PaymentService paymentService = new PaymentService(bankService);

        assertTrue(paymentService.makePayment("123","456",200));

    }
}
