package com.example.demo.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.util.HashMap;


/**
 * <p>
 *  将HashMap 转换为 Bean
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-22
 */
public class BeanMap  extends HashMap<String,Object> implements Serializable{

        private static final long serialVersionUID = -5809782578272943999L;

        public Object toBean(Class<?> clazz){
            try {
                Object obj = clazz.newInstance();
                BeanUtils.populate(obj,this);
                return obj;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}
