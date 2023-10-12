package com.example.event.consumer;

import com.example.event.schema.Event;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class EventMessagingConsumerServiceImpl {


    @Autowired
    private ObjectMapper mapper;


    @KafkaListener(topics = "${avro.topic.name}",containerFactory = "kafkaListenerContainerFactory")
    public void obtainEvent(ConsumerRecord<String, Event> record)  {
        log.info("payload {} was received in the Consumer", record.key() + "," +record.value());

    }


}
