package com.company.upipayments;

public class PhonePe implements UpiPayments {
    @Override
    public void getMoney() {
      System.out.println("Money sent via phonepe");
    }

    @Override
    public void getScratchCard() {
        System.out.println("scratch card earned in phonepe");

    }
}
