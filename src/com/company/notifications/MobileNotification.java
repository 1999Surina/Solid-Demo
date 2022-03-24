package com.company.notifications;

public class MobileNotification implements Notifications {
    @Override
    public void sendOTP(String medium) {
          System.out.println("otp sent to your  mobile");
    }

    @Override
    public void sendTransactionReport(String msg) {
          System.out.println("Transaction report sent to your mobile");
    }
}
