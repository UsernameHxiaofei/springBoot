package cn.itcast.day01.mvcConfig;

import cn.itcast.day01.inteceptor.loginInteceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    private loginInteceptor loginInteceptor;


    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInteceptor).addPathPatterns("/**");
    }
}
