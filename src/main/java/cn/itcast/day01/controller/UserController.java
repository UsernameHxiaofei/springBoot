package cn.itcast.day01.controller;

import cn.itcast.day01.Pojo.ResultInfo;
import cn.itcast.day01.Pojo.User;
import cn.itcast.day01.Pojo.UserVo;
import cn.itcast.day01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * RestController
 */
@RestController //变成spring对象
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "insertUser", method = RequestMethod.POST)
    public ResultInfo insertUser (@RequestBody User user) {
//     Boolean flag =  userService.insertUser(user);
//     if (flag) {
//         return new ResultInfo(true, null, null);
//     } else {
//         return new ResultInfo(false, null, null);
//     }
        return  null;
    }








}
