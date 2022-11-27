package com.arjun.rabbitmq.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjun.rabbitmq.model.Product;
import com.arjun.rabbitmq.service.RabbitMQProducer;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	private RabbitMQProducer producer;

    public ProductController(RabbitMQProducer producer) {
        this.producer = producer;
    }
    
    @PostMapping("/publish")
    public String sendMessage(@RequestBody Product product){
        producer.sendMessage(product);
        return "Message sent to RabbitMQ ...";
    }
	
}
