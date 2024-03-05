package org.testify;

import org.junit.jupiter.api.Test;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;
import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    BankService bankService = new BankService();
    PaymentService paymentService = new PaymentService(bankService);

    BaseRateProvider baseRateProvider = new BaseRateProvider() {
        @Override
        public double getBaseRate() {
            return 2;
        }
    };



    @Test
    public void testCalculateInterestRateAdjustmentValidLowLoanAmount(){
        assertEquals(4.25, paymentService.calculateInterestRateAdjustment(100,500,3,baseRateProvider));
    }

    @Test
    public void testCalculateInterestRateAdjustmentValidHighLoanAmount(){
        assertEquals(4, paymentService.calculateInterestRateAdjustment(100005,500,3,baseRateProvider));
    }

    @Test
    public void testCalculateInterestRateAdjustmentValidSuperHighLoanAmount(){
        assertEquals(3.75, paymentService.calculateInterestRateAdjustment(500005,500,3,baseRateProvider));
    }

    @Test
    public void testCalculateInterestRateAdjustmentValidMediumCreditScore(){
        assertEquals(3.75, paymentService.calculateInterestRateAdjustment(100,650,3,baseRateProvider));
    }

    @Test
    public void testCalculateInterestRateAdjustmentValidHighCreditScore(){
        assertEquals(3.25, paymentService.calculateInterestRateAdjustment(100,720,3,baseRateProvider));
    }

    @Test
    public void testCalculateInterestRateAdjustmentValidSuperHighCreditScore(){
        assertEquals(2.75, paymentService.calculateInterestRateAdjustment(100,850,3,baseRateProvider));
    }

    // durationYears <= 5
    // durationYears > 15

    @Test
    public void testCalculateInterestRateAdjustmentValidMediumDuration(){
        assertEquals(4, paymentService.calculateInterestRateAdjustment(100,500,6,baseRateProvider));
    }

    @Test
    public void testCalculateInterestRateAdjustmentValidLongDuration(){
        assertEquals(3.75, paymentService.calculateInterestRateAdjustment(100,500,16,baseRateProvider));
    }

    @Test
    public void testInvalidLoanAmount(){
        assertThrows(IllegalArgumentException.class,()->{paymentService.calculateInterestRateAdjustment(-100,500,16,baseRateProvider);});
    }

    @Test
    public void testInvalidDurationYears(){
        assertThrows(IllegalArgumentException.class,()->{paymentService.calculateInterestRateAdjustment(100,-5,16,baseRateProvider);});
    }

    @Test
    public void testInvalidCreditScoreLow(){
        assertThrows(IllegalArgumentException.class,()->{paymentService.calculateInterestRateAdjustment(100,5,100,baseRateProvider);});
    }

    @Test
    public void testInvalidCreditScoreHigh(){
        assertThrows(IllegalArgumentException.class,()->{paymentService.calculateInterestRateAdjustment(100,5,10009,baseRateProvider);});
    }


}
