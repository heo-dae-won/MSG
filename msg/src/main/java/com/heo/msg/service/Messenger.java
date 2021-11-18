package com.heo.msg.service;

import com.heo.msg.enums.MessengerType;

public interface Messenger {

    public default String defaultMethod(String str){
        return "default Method" + str;
    }

    static void staticMethod(String str){
        System.out.println("staticMethod =>" + str);
    }

    public void setMessenger();

    public boolean sendMsg(String msg);
}
