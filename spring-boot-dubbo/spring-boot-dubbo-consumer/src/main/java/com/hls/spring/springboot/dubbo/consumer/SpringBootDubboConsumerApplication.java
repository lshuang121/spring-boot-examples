package com.hls.spring.springboot.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo
@ImportResource("classpath:dubbo-consumer.xml")
public class SpringBootDubboConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootDubboConsumerApplication.class, args);
  }

}
