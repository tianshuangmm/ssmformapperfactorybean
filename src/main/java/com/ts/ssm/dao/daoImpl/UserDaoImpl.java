package com.ts.ssm.dao.daoImpl;

import com.ts.ssm.bean.User;
import com.ts.ssm.dao.UserDao;
import com.ts.ssm.dao.mapping.UserMapper;

public class UserDaoImpl implements UserDao {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(Integer id) {
        return userMapper.getUser(id);
    }
}