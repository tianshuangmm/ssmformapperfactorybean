package com.ts.ssm.service.serviceImpl;

import com.ts.ssm.bean.User;
import com.ts.ssm.dao.mapping.UserDao;
import com.ts.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao UserDao;

    public User getUserById(Integer id) {
        return UserDao.getUserById(id);
    }


}
