package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Devices;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.Policys;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface PolicysMapper extends BaseMapper<Policys> {

    List<DistTypeVo> findPolicysName();
    IPage<Policys> findPolicys(IPage<Policys> page, @Param("policy") String policy);
}
