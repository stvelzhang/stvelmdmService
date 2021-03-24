package com.example.demo.mapper;

import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.PolicyPhoneCommon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.columnNameVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface PolicyPhoneCommonMapper extends BaseMapper<PolicyPhoneCommon> {
    List<columnNameVo> findcolumnName();
}
