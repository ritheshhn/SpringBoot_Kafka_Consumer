package com.thantrick.SpringBoot_Kafka_Consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private String email;
    private String project;
    private String laptopId;
}
