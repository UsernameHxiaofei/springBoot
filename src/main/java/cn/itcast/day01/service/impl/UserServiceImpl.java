package cn.itcast.day01.service.impl;

import cn.itcast.day01.Pojo.User;
import cn.itcast.day01.mapper.Usermapper;
import cn.itcast.day01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private Usermapper usermapper;



    @Override
    public Boolean insertUser(User user) throws Exception {
        if(user == null) {
            throw new Exception("用户不能为null");
        } else if ("".equals(user.getUserName())) {
            throw new Exception("用户名不能为空");
        }
        return null;
    }
}
