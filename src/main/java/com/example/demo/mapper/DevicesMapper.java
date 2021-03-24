package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Devices;
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
public interface DevicesMapper extends BaseMapper<Devices> {

//    List<Devices> findDevicesDynamic(@Param("prdModel") String  prdModel, @Param("gupName") String gupName);
    IPage<Devices> findDevicesDynamic(IPage<Devices> page, @Param("prdModel") String  prdModel, @Param("gupName") String gupName);
    IPage<Devices> findDevicesDynamicWeb(IPage<Devices> page, @Param("prdModel") String  prdModel, @Param("gupName") String gupName,@Param("policy") String policy, @Param("sn") String sn);
    IPage<Devices> findDevicePolicysDynamicWeb(IPage<Devices> page, @Param("prdModel") String  prdModel, @Param("gupName") String gupName,@Param("policy") String policy, @Param("sn") String sn);

}
