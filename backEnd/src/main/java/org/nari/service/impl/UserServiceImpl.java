package org.nari.service.impl;

import org.nari.mapper.UserMapper;
import org.nari.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    //PageHelper.startPage(pageRequest.getPageNum(),pageRequest.getPageSize());
}
