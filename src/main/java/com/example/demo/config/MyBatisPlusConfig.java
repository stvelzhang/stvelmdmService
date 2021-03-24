package com.example.demo.config;




import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Author DQ
 * Date 2020/12/7
 **/
@MapperScan("com.example.demo.mapper")
//开启事务
@EnableTransactionManagement
@Configuration
public class MyBatisPlusConfig {

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        System.out.println("进入拦截器PaginationInnerInterceptor");
        return  new PaginationInnerInterceptor();
    }

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        System.out.println("进入拦截器     PaginationInterceptor ");
        return  new PaginationInterceptor();
    }

}
