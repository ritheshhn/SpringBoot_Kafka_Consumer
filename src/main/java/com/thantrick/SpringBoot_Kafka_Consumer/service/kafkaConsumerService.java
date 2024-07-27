package com.thantrick.SpringBoot_Kafka_Consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumerService {

    Logger logger = LoggerFactory.getLogger(kafkaConsumerService.class);

    @KafkaListener(topics = "demoTopic3-from-Config", groupId = "demoGroup2")
    public void consumeMessage1(String msg){
        logger.info("Consumer1 consumed message : {}", msg);
    }

    @KafkaListener(topics = "demoTopic3-from-Config", groupId = "demoGroup2")
    public void consumeMessage2(String msg){
        logger.info("Consumer2 consumed message : {}", msg);
    }

    @KafkaListener(topics = "demoTopic3-from-Config", groupId = "demoGroup2")
    public void consumeMessage3(String msg){
        logger.info("Consumer3 consumed message : {}", msg);
    }

    @KafkaListener(topics = "demoTopic3-from-Config", groupId = "demoGroup2")
    public void consumeMessage4(String msg){
        logger.info("Consumer4 consumed message : {}", msg);
    }
}
