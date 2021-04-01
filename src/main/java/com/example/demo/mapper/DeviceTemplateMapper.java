package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.DeviceTemplate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.TaskTime;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-29
 */
public interface DeviceTemplateMapper extends BaseMapper<DeviceTemplate> {
    IPage<DeviceTemplateVo> findTemplates(IPage<DeviceTemplateVo> page, @Param("product") String product, @Param("templateName") String templateName);
    List<DistTypeVo> findNodeDistType(@Param("product")String product);
}
