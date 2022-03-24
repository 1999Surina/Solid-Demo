package com.company;
import com.company.notifications.MobileNotification;
import com.company.notifications.Notifications;
import com.company.upipayments.Cashback;
import com.company.upipayments.GPay;
import com.company.upipayments.PhonePe;
import com.company.upipayments.UpiPayments;
import com.company.cardpayments.CardUsed;
import com.company.cardpayments.CreditCard;


public class Main {


    public static void main(String[] args) {

        CardUsed cardUsed=new CreditCard();
        cardUsed.doTransaction(5000);

        Notifications notifications=new MobileNotification();
        notifications.sendOTP("hello");


        Cashback cashback=new GPay();
        cashback.getCashBackAsCreditBalance();

        UpiPayments upiPayments=new PhonePe();
        upiPayments.getMoney();

     }
    }

