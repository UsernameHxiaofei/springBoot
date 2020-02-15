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
import java.util.List;

/**
 * RestController
 */
@RestController //变成spring对象
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 使用 servlet获取参数
     * @param request
     * @param response
     * @param session
     */
    @RequestMapping(value = "getParamer", method = RequestMethod.GET)
    public void getParamer (HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request.getParameter("userName"));
        System.out.println(Integer.parseInt(request.getParameter("age")));
    }


    /**
     * 获取请求路径中的占位符
     * @param name
     * @return
     */
    @RequestMapping(value="getPathvariable/{name}", method= RequestMethod.GET)
    public String getPathvariable (@PathVariable("name") String name) {
        StringBuffer sb = new StringBuffer("参数是: ");
        sb.append(name);
        return sb.toString();
    }


    /**
     * 接受普通类型的数据
     */

    @RequestMapping(value = "getRequestParam", method = RequestMethod.POST)
    public String getRequestParam (
            @RequestParam("userName") String userName,
            @RequestParam("age") Integer age,
            @RequestParam("isMarray") Boolean isMarray,
            @RequestParam("salary") Double salary,
            @RequestParam("habby") String[] habby
     ) {
        StringBuffer sb = new StringBuffer("参数是: ");
        sb.append(userName).append(age).append(isMarray).append(salary).append(Arrays.toString(habby));
        String s = sb.toString();
        return s;
    }

    /**
     * 获取pojo类型的数据
     */

    @RequestMapping(value = "getPojo", method = RequestMethod.POST)
    public  String  getPojo (@RequestBody User user) {
        System.out.println("user = " + user);
        return "success";
    }

    /**
     * 获取集合类型的数据
     */

    @RequestMapping(value = "getList", method = RequestMethod.POST)
    public String getList (@RequestBody UserVo list) {
        System.out.println("list = " + list);
        return "success";
    }





}
