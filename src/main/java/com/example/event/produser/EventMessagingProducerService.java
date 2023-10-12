package com.example.event.produser;

import com.example.event.schema.Event;

public interface EventMessagingProducerService {

    Event sendEvent(Event event);


}
