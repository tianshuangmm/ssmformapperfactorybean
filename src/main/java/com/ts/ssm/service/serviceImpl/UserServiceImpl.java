package com.ts.ssm.service.serviceImpl;

import com.ts.ssm.bean.User;
import com.ts.ssm.dao.UserDao;
import com.ts.ssm.dao.mapping.UserMapper;
import com.ts.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {

        return userMapper.getUserById(id);
    }


}
