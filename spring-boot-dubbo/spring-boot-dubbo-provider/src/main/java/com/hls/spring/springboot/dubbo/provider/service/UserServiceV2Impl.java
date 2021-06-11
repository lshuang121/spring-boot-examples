package com.hls.spring.springboot.dubbo.provider.service;

import com.hls.spring.common.contract.IUserService;
import com.hls.spring.common.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceV2Impl implements IUserService {
  private static final Logger log = LoggerFactory.getLogger(UserServiceV2Impl.class);

  @Override
  public User getUserById(int uid) {
    User user = new User();
    user.setAge(22);
    user.setName("LongV2");
    user.setUid(1);
    return user;
  }
}
