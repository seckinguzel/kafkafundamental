package com.apachekafka.fundamental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

//Mesaj yaratan class'ımız.

@Component
public class Publisher {
    @Autowired
    KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        template.send("appTopic", message);
    }
}
