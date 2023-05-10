package com.bank.persone;

public class Operations3 {

    public static void transaction4(Persone persone1, Persone persone2, int ammount) {
        int finalSumPersone1 = 0;
        int finalSumPersone2 = 0;
        Bill extraBill1 = Operations3.extraMethodPersone(persone1);
        Bill extraBill2 = Operations3.extraMethodPersone(persone2);


        finalSumPersone1 = extraBill1.getAmmount() - ammount;
        finalSumPersone2 = extraBill2.getAmmount() + ammount;
        if (extraBill1.getAmmount() < ammount) {
            System.out.println("На вашем счете недостаточно средств");
        } else {
            extraBill1.setAmmount(finalSumPersone1);
            extraBill2.setAmmount(finalSumPersone2);


        }
    }

    public static Bill extraMethodPersone(Persone persone1) {
        int extraBillId = 0;
        Bill extraBill1 = null;
        for (int i = 0; i < persone1.getBills().length; i++) {
            if (persone1.getBills()[i].getBillId() > extraBillId) {
                extraBillId = persone1.getBills()[i].getBillId();
                extraBill1 = persone1.getBills()[i];
            }
        }
        return extraBill1;
    }
}
