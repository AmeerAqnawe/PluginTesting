package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testify.entity.BankService;
import org.testify.entity.BaseRateProvider;

class PaymentServiceTest {

    @Test
    void TestMakePayment() {
        BankService bankService = new BankService();
        PaymentService paymentService = new PaymentService(bankService);

        Boolean result = paymentService.makePayment("1234", "4321", 12);
        Assertions.assertTrue(result);
    }

    @Test
    void TestMakePaymentThrowsExceptionForNegativeAmount() {
        BankService bankService = new BankService();
        PaymentService paymentService = new PaymentService(bankService);

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> paymentService.makePayment("1234", "4321", -2));
    }

}
