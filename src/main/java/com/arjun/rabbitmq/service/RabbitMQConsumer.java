package com.arjun.rabbitmq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.arjun.rabbitmq.model.Product;

@Service
public class RabbitMQConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consume(Product product){
        LOGGER.info(String.format("Received product -> %s", product));
    }
    
}
