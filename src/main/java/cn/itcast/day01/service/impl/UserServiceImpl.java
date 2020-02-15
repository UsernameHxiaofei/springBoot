package cn.itcast.day01.service.impl;

import cn.itcast.day01.Pojo.User;
import cn.itcast.day01.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



    @Override
    public Boolean insertUser(User user) {
        try {
            if (null == user) {
                throw  new Exception("user不存在");
            } else if (user.getUserName() == null) {
                throw new Exception("user_name必填");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
