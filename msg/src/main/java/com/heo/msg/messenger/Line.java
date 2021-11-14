package com.heo.msg.messenger;

import com.heo.msg.service.Messenger;
import org.springframework.stereotype.Service;

@Service
public class Line implements Messenger {

    @Override
    public void setMessenger() {
        System.out.println("Line set messenger");
    }

    @Override
    public boolean sendMsg(String msg) {
        setMessenger();
        System.out.println("Line send msg == " + msg);

        return true;
    }
}
