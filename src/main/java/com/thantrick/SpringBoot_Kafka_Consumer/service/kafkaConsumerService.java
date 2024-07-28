package com.thantrick.SpringBoot_Kafka_Consumer.service;

import com.thantrick.SpringBoot_Kafka_Consumer.dto.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumerService {

    Logger logger = LoggerFactory.getLogger(kafkaConsumerService.class);

    @KafkaListener(topics = "msgTopic", groupId = "msg-consumer-group")
    public void consumeMessage1(String msg){
        logger.info("Consumer1 consumed message : {}", msg);
    }

    /*@KafkaListener(topics = "msgTopic", groupId = "msg-consumer-group")
    public void consumeMessage2(String msg){
        logger.info("Consumer2 consumed message : {}", msg);
    }*/

    /*@KafkaListener(topics = "msgTopic", groupId = "msg-consumer-group")
    public void consumeMessage3(String msg){
        logger.info("Consumer3 consumed message : {}", msg);
    }

    @KafkaListener(topics = "msgTopic", groupId = "msg-consumer-group")
    public void consumeMessage4(String msg){
        logger.info("Consumer4 consumed message : {}", msg);
    }*/

    @KafkaListener(topics = "empTopic....", groupId = "emp-consumer-group")
    public void consumeEmployee1(Employee emp){
        logger.info("Emp consumer1 consume the employee events {} ", emp.toString());
    }

    /*@KafkaListener(topics = "empTopic", groupId = "emp-consumer-group")
    public void consumeEmployee2(Employee emp){
        logger.info("Emp consumer2 consume the employee events {} ", emp.toString());
    }*/

}
