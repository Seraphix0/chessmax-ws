package com.mellykusjes.chessmaxws.controllers;

import com.mellykusjes.chessmaxws.models.Notification;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotifyController {

    @MessageMapping("/notification")
    @SendTo("/topic/notifications")
    public Notification notification(Notification apiNotification) throws Exception {
        Thread.sleep(1000); // simulated delay
        return apiNotification;
    }
}
