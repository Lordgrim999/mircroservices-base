package com.microservice.twitter.to.kafka.service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import twitter4j.v1.Status;
import twitter4j.v1.StatusAdapter;

@Component
public class TwitterKafkaListener extends StatusAdapter {
    private static final Logger LOG= LoggerFactory.getLogger(TwitterKafkaListener.class);

    @Override
    public void onStatus(Status status)
    {
        LOG.info("Twitter with status {}",status.getText());
    }
}
