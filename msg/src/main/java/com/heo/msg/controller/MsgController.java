package com.heo.msg.controller;

import com.heo.msg.enums.MessengerType;
import com.heo.msg.service.MessengerService;
import com.heo.msg.service.Messenger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MsgController {

    final MessengerService messengerService;

    private MsgController(MessengerService messengerService){
        this.messengerService = messengerService;
    }

    @PostMapping("/msg")
    public ResponseEntity<Boolean> sendMsg(@RequestParam MessengerType messengers
                                           , @RequestParam String message){

        Messenger messenger = messengerService.getMessenger(messengers);
        System.out.println("메신저 전송 결과 == " + messenger.sendMsg(message));

        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

}
