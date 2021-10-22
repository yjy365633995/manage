package org.nari.service.impl;

import org.nari.mapper.UserMapper;
import org.nari.model.User;
import org.nari.service.UserService;
import org.nari.util.MD5;
import org.nari.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public boolean login(User user) {
        User userInfo = userMapper.getUserByAccount(user.getAccount());
        if(null != userInfo){
            return userInfo.getPassword().equals(MD5.getMD5(user.getPassword()));
        }
        return false;
    }

    @Override
    public User register(User user) {
        if(null!=getUserInfo(user.getAccount()))
            return null;
        user.setUserId(UUID.getUUID());
        user.setPassword(MD5.getMD5(user.getPassword()));
        userMapper.insert(user);
        return getUserInfo(user.getAccount());
    }

    @Override
    public User modifyUser(User user) {
        userMapper.updateById(user);
        return userMapper.getUserById(user.getUserId());
    }

    @Override
    public User getUserInfo(String account) {
        return userMapper.getUserByAccount(account);
    }

    @Override
    public boolean modifyPassword(User user) {
        user.setPassword(MD5.getMD5(user.getPassword()));
        return userMapper.updatePassword(user) == 1;
    }

    @Override
    public List<User> getSuppliers() {
        return userMapper.getUserByRole(User.Role.Supplier.ordinal());
    }

    @Override
    public List<User> getPurchasers() {
        return userMapper.getUserByRole(User.Role.Purchaser.ordinal());
    }

}
