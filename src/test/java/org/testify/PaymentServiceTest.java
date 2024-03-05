package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testify.entity.BankService;

class PaymentServiceTest {

    @Test
    void TestMakePayment() {
        BankService bankService = new BankService();
        PaymentService paymentService = new PaymentService(bankService);

        Boolean result = paymentService.makePayment("1234", "4321", 12);
        Assertions.assertTrue(result);
    }

}
