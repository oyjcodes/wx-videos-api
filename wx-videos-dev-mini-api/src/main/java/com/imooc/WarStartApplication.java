package com.imooc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Classname WarStartApplication
 * @Description 继承SpringBootServletInitializer.相当于使用web.xml的形式去启动部署
 * @Date 2019/8/4 12:28
 * @Created by oyj
 */
public class WarStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //使用web.xml运行应用程序，指向Application，最后启动springBoot
        return builder.sources(Application.class);
    }
}
