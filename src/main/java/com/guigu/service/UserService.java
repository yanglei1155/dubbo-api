package com.guigu.service;

import com.guigu.pojo.User;
import com.guigu.pojo.basecom.Result;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    User getUser();
    Result saveUser(User user);
}
