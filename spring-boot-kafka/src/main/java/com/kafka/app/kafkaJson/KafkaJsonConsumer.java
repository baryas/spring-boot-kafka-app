package com.kafka.app.kafkaJson;

import com.kafka.app.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics = {"messageTopic"})
    public void consumerJsonMessage(User user ){
    LOGGER.info(String.format("Subscribed json message -> %s",user.toString() ));
    }


}
