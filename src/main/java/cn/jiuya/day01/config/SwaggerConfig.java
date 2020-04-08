package cn.jiuya.day01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .host("http://localhost:8080")
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("cn.jiuya.day01.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("测试订单系统")
                    .description("订单系统接口文档")
                    .version("1.0")
                    .build();
        }

    /**
     *
     *  @Api：修饰整个类，描述Controller的作用
     *  @ApiOperation：描述一个类的一个方法，或者说一个接口
     *  @ApiParam：单个参数描述
     *  @ApiModel：用对象来接收参数
     *  @ApiProperty：用对象接收参数时，描述对象的一个字段
     *  @ApiResponse：HTTP响应其中1个描述
     *  @ApiResponses：HTTP响应整体描述
     *  @ApiIgnore：使用该注解忽略这个API
     *  @ApiError ：发生错误返回的信息
     *  @ApiImplicitParam：一个请求参数
     *  @ApiImplicitParams：多个请求参数
     *
     *
     *
     *      @GetMapping("list")
     *     @ApiOperation(value = "分页查询当前用户订单，并且可以根据订单状态过滤",
     *                   notes = "分页查询当前用户订单")
     *     @ApiImplicitParams({
     *         @ApiImplicitParam(name = "page", value = "当前页",
     *                           defaultValue = "1", type = "Integer"),
     *         @ApiImplicitParam(name = "rows", value = "每页大小",
     *                           defaultValue = "5", type = "Integer"),
     *         @ApiImplicitParam(
     *             name = "status",
     *             value = "订单状态：1未付款，2已付款未发货，3已发货未确认，4已确认未评价，5交易关闭，6交易成功，已评价", type = "Integer"),
     *     })
     *  */


}
