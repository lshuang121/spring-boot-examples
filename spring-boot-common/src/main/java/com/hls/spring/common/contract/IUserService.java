package com.hls.spring.common.contract;

import com.hls.spring.common.model.User;

public interface IUserService {
  User getUserById(int uid);
}
