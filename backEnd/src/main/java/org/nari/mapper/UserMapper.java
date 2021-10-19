package org.nari.mapper;

import org.nari.model.User;

public interface UserMapper {
    int insert(User user);

    int updateByPrimaryKey(User user);

    int deleteByUserId(String userId);
}