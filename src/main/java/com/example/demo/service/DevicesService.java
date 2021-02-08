package com.example.demo.service;

import com.example.demo.pojo.Devices;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface DevicesService extends IService<Devices> {

    void deleteDeviceBySn(String sn);

    void findDevicesBySn(String sn);
}
