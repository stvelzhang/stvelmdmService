package com.example.demo.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Author stvelzhang
 * Date 2021/02/22
 **/
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("fill  insert  start");
        this.setFieldValByName("createTime", new Date(),metaObject);
        log.info("fill  insert  createTime" + new Date());
        System.out.println(new Date());
        this.setFieldValByName("updateTime", new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("fill  update  start");
        this.setFieldValByName("updateTime", new Date(),metaObject);

    }
}
