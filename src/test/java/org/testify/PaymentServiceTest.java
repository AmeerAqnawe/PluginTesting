package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentServiceTest {


    @Test
    void testCalculateInterestRateAdjustment(){
        BaseRateProvider baseRateProvider = new BaseRateProvider() {
            @Override
            public double getBaseRate() {
                return 2.5;
            }
        };
        assertThrows(IllegalArgumentException.class, () -> {PaymentService.calculateInterestRateAdjustment(
                1000, 400, 0, baseRateProvider);}, "Calculate Interest Rate Adjustment should throw exception");
        assertThrows(IllegalArgumentException.class, () -> {PaymentService.calculateInterestRateAdjustment(
                1000, 250, 0, baseRateProvider);}, "Calculate Interest Rate Adjustment should throw exception");
        assertThrows(IllegalArgumentException.class, () -> {PaymentService.calculateInterestRateAdjustment(
                -100, 400, 3, baseRateProvider);}, "Calculate Interest Rate Adjustment should throw exception");
    }

}
