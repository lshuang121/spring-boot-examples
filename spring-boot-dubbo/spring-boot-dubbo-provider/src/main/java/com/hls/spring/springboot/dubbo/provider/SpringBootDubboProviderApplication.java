package com.hls.spring.springboot.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.hls.spring")
public class SpringBootDubboProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootDubboProviderApplication.class, args);
  }

}
