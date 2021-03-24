package com.example.demo.service.impl;

import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.Products;
import com.example.demo.mapper.ProductsMapper;
import com.example.demo.service.ProductsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products> implements ProductsService {

    @Resource
    ProductsMapper productsMapper;

    @Override
    public List<DistTypeVo> findProductsName() {
        List<DistTypeVo>  productsName = productsMapper.findProductsName();
        return productsName;
    }
}
