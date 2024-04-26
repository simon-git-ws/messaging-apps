package com.hemanoid.mq.kafka.consumer.message;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "hemanoid-feeds", groupId = "test-consumer-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}
