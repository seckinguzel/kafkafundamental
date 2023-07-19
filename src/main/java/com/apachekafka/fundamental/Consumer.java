package com.apachekafka.fundamental;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//Mesaj dinleyen class'ımız yani listener'imiz.

@Component
public class Consumer {
    @KafkaListener(topics = "appTopic", groupId = "group1")
    public void listenMessage(String message) {
        System.out.println(message);
    }
}
