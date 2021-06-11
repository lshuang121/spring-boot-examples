package com.hls.spring.springboot.dubbo.provider.service;

import com.hls.spring.common.contract.IUserService;
import com.hls.spring.common.model.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DubboService(version = "${user.service.version}")
public class UserServiceImpl implements IUserService {
  private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

  @Override
  public User getUserById(int uid) {
    User user = new User();
    user.setAge(18);
    user.setName("David");
    user.setUid(1);
    return user;
  }
}
