package com.example.event.controller;

import com.example.event.schema.Event;
import com.example.event.produser.EventMessagingProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/event")
@RestController
public class EventController {

    @Autowired
    private EventMessagingProducerService messagingService;

    @PostMapping("sendEvent")
    public Event asyncCreateEvent(@RequestBody Event event) {
        return messagingService.sendEvent(event);
    }

}
