package com.company.cardpayments;

public class CreditCard implements CardUsed{
    public void doTransaction(long amount){
        System.out.println("payment done using credit card"+" "+"of amount"+" "+ "Rs"+amount);

}

}
