package com.heo.msg.messenger;

import com.heo.msg.service.Messenger;
import org.springframework.stereotype.Service;

@Service
public class Slack implements Messenger {

    @Override
    public void setMessenger() {
        System.out.println("slack set messenger");
    }

    @Override
    public boolean sendMsg(String msg) {
        setMessenger();
        System.out.println("slack sendMsg == " + msg);

        return true;
    }
}
