package com.zeph.kafka.spring.demo;

import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class KafkaMessageController {

  @ResponseStatus(CREATED)
  @ResponseBody
  @RequestMapping(value = "/orders", method = POST)
  public Order createOrder(@RequestBody Order order) {
    return order;
  }

}
