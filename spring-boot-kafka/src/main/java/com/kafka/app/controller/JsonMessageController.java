package com.kafka.app.controller;

import com.kafka.app.entity.User;
import com.kafka.app.kafkaJson.KafkaJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private KafkaJsonProducer kafkaJsonProducer;

    public JsonMessageController(KafkaJsonProducer kafkaJsonProducer){
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping("/user")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        kafkaJsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok().body("Message is sent to topic -> " + user);
    }

}
