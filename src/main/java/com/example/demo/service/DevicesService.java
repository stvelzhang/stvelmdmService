package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Devices;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.DeviceVo;
import com.example.demo.vo.DeviceWVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface DevicesService extends IService<Devices> {

    void deleteDeviceById(Integer id);

    void deleteDeviceBySn(String sn);

    List<Devices> findDevicesBySn(String sn);

    void findDevices(DeviceVo deviceVo);

    IPage<Devices> findDevicesWeb(DeviceWVo deviceWVo);
    IPage<Devices> getDevicePolicysWeb(DeviceWVo deviceWVo);
    void saveDevice(DeviceVo deviceVo);

    void updateDevice(DeviceVo deviceVo);

}
