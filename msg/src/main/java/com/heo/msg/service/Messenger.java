package com.heo.msg.service;

import com.heo.msg.enums.MessengerType;

public interface Messenger {
    public void setMessenger();

    public boolean sendMsg(String msg);


}
