package com.company.cardpayments;

public class DebitCard implements CardUsed{
    public void doTransaction(long amount){
        System.out.println("payment done using debit card"+" "+"of amount"+" "+ "Rs"+amount);
}

}
