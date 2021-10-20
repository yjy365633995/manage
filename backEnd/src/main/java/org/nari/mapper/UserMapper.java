package org.nari.mapper;

import org.nari.model.User;

import java.util.List;

public interface UserMapper {
    int insert(User user);

    int updateById(User user);

    User getUserByAccount(String account);

    User getUserById(String userId);

    List<User> getAll();

    User getUserByCompanyCode(String companyCode);

    List<User> getUserByRole(Integer role);

    int deleteByUserId(String userId);
}