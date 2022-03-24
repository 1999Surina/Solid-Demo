package com.company.cardpayments;



public class SuperMart {
    private static CardUsed cardUsed;

    public SuperMart(CardUsed cardUsed) {
        this.cardUsed = cardUsed;
    }
    public  static void doPurchase(long amount){
        cardUsed.doTransaction(amount);
    }
}
