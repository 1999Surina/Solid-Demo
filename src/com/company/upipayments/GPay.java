package com.company.upipayments;

public class GPay implements Cashback{

    @Override
    public void getCashBackAsCreditBalance() {
   System.out.println("cashback earned as credit balance in gpay");
    }

    @Override
    public void getMoney() {
        System.out.println("Money sent via gpay");

    }

    @Override
    public void getScratchCard() {
        System.out.println("scratch card earned in gpay");
    }
}
