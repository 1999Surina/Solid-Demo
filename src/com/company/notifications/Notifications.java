package com.company.notifications;

public interface Notifications {

    public void sendOTP(String medium);


    public void sendTransactionReport(String msg);

}
