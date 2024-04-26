package com.hemanoid.mq.kafka.producer;

import com.hemanoid.mq.kafka.producer.message.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;

@EnableScheduling
@SpringBootApplication
public class KafkaProducerApplication {

    @Autowired
    private MessageProducer producer;

    public static void main(String[] args) {SpringApplication.run(KafkaProducerApplication.class, args);}

    @Scheduled(fixedRate = 1000)
    public void sendRandomTextToTopic() {
        producer.sendMessage("hemanoid-feeds", "Hello! From Springboot!!! - "+ new Random().nextInt());
    }
}
