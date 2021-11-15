package com.heo.msg.service;

import com.heo.msg.enums.MessengerType;
import com.heo.msg.messenger.Line;
import com.heo.msg.messenger.Slack;
import org.springframework.stereotype.Service;

@Service
public class MessengerService {

    final Slack slack;
    final Line line;

    public MessengerService(Slack slack, Line line){
        this.slack = slack;
        this.line = line;
    }

    public Messenger getMessenger(MessengerType type){
        Messenger messenger = null;

        if(type == MessengerType.SLACK){
            messenger = slack;
        }else if(type == MessengerType.LINE) {
            messenger = line;
        }
        return messenger;
    }

    @Override
    public String toString(){
        return "{ " +
                "slack ==> " + slack.toString()
                + "line ==> " + line.toString()
                + " }";
    }
}
