package com.zeph.kafka.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class KafkaMessageController {

  @Autowired
  private KafkaTemplate<Object, Order> template;

  @Value("${kafka.topic}")
  private String topic;

  @ResponseStatus(CREATED)
  @ResponseBody
  @RequestMapping(value = "/orders", method = POST)
  public Order createOrder(@RequestBody Order order) {
    try {
      template.send(topic, order).get(5000, TimeUnit.MILLISECONDS);
    } catch (InterruptedException | ExecutionException | TimeoutException e) {
      e.printStackTrace();
    }
    return order;
  }

}
