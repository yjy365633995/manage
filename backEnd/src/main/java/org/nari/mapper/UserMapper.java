package org.nari.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.nari.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User user);

    int updateById(User user);

    int updatePassword(User user);

    User getUserByAccount(String account);

    User getUserById(String userId);

    List<User> getAll();

    User getUserByCompanyCode(String companyCode);

    List<User> getUserByRole(Integer role);

    int deleteByUserId(String userId);
}