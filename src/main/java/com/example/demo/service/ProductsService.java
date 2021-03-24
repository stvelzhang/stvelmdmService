package com.example.demo.service;

import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.Products;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface ProductsService extends IService<Products> {
    List<DistTypeVo> findProductsName();
}
