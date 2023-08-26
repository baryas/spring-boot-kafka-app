package com.kafka.app.entity;

import lombok.Data;
import lombok.Generated;

import java.util.UUID;

@Data
public class User {

    private UUID  messageId = UUID.randomUUID();
    private String name;
    private String email;

}
