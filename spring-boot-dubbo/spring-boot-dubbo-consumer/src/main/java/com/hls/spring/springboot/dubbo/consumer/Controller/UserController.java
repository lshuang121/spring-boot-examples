package com.hls.spring.springboot.dubbo.consumer.Controller;

import com.hls.spring.common.contract.IUserService;
import com.hls.spring.common.model.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class UserController {
  private static final Logger log = LoggerFactory.getLogger(UserController.class);

  @DubboReference(version = "${user.service.version}",check = false)
  IUserService userService;

  @Resource
  IUserService userServiceV2;

  @RequestMapping("")
  public User getUser(){
    return userService.getUserById(1);
  }

  @RequestMapping("v2")
  public User getUserV2(){
    return userServiceV2.getUserById(1);
  }

}
