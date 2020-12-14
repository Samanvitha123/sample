package com.mvc.dao;

import com.mvc.bean.LoginBean;
import com.mvc.bean.Register;
public interface UserDao {
  void register(Register user);
  Register validateUser(LoginBean login);
}