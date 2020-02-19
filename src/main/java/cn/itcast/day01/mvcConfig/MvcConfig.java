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


    /**
     * JdbcTemeplate 是spring提供的 简化jdbc对数据库的操作
     *
     * 在数据库查询出来的数据要分分装到实体上使用原先的操作比较繁琐
     *
     *
     * jdbcTemaplate提供了3中 exceut  update excutexxx
     *
     * new JdbcTemaplate(DataSource dataSource)
     * 准备sql
     * jb.excute(sql) //创建表的语句
     * jb。update(sql) 增删改的语句
     * jb.excuteXXX 查询语句
     *
     *
     *增删改
     * jdbcTemeplate.update("insert into Student values(null,?,?), "",""")
     *
     *
     *
     * /查询要多少个学生
     *
     * jdbcTemeplate.queryForObject 查询单行单列  或者是聚合函数的
     *
     * Jdbctemeplate jd= new JdbcTemeplate(dataSource);
     * select user_name as userName from student where id = ?
     * String name = jd.queryForObject(sql, String.class, 1);
     *
     * JdbcTemeplate jd = new JdbcTemeplate(DataSource);
     * String sql ="select count(*) from Student"
     * jd.queryForObject(sql, Integer.class);
     *
     *
     *
     * JdbcTemeplate.queryForMap()  返回的是map集合 对象 适用于查询单条数据
     *
     * 插叙id为2的这条数据的对象
     *
     * new Jdbctemeplate (DataSource);
     * Map<String, OBbject> map = jd.queryForMap("select * from student where id = ?, 2);
     *
     *
     *
     * 查询所有的用户
     * queryForlist
     *
     * new Jdbctemeplate(dataSource);
     *
     * 发送sql语句返回结果
     * List<Map<String, Object>> list = jd.queryForList(select * from student)
     *
     */
}
