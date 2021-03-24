package com.example.demo.mapper;

import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.Products;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface ProductsMapper extends BaseMapper<Products> {

    List<DistTypeVo> findProductsName();
}
