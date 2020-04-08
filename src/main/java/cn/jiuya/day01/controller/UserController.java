package cn.jiuya.day01.controller;

import cn.jiuya.day01.Pojo.ResultInfo;
import cn.jiuya.day01.Pojo.User;
import cn.jiuya.day01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

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

    @GetMapping("test")
    public void test (HttpServletRequest request) {
        //获取请求的地址
        String requestURI = request.getRequestURI();
        //获取请求的方式
        String method = request.getMethod();
        //获取请求的头中的数据
        String host = request.getHeader("host");
        //获取发请求的·主机的ip地址
        String remoteAddr = request.getRemoteAddr();
        //获取cookie的值的数组
        Cookie[] cookies = request.getCookies();
        //遍历数组
        for (Cookie cookie : cookies) {
            //取出cookis的名字
            System.out.println(cookie.getName());
            //取出cookie的值
            System.out.println(cookie.getValue());
        }

        //创建一个cookie
        Cookie cookie = new Cookie("ly_token","123456");
        //设置cookie的保存地址
        cookie.setPath("/jiuya");
        //设置cookie的有效时间
        cookie.setMaxAge(60*5);


        //request的与对象
        request.setAttribute("hjf","fd");
        request.getAttribute("hjf");




    }



    public void tets01 (HttpServletRequest request, HttpServletResponse response, HttpSession session) {


    }








}
