package com.hls.spring.springboot.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.hls.spring")
@ImportResource("classpath:dubbo-provider.xml")
public class SpringBootDubboProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootDubboProviderApplication.class, args);
  }

}
