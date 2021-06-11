package com.hls.spring.springbootdocker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {
  private static final Logger log = LoggerFactory.getLogger(MainController.class);
  @RequestMapping("")
  public String hello(){
    log.info("hello!");
    return "Hello, Docker!";
  }
}
