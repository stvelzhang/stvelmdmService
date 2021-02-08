package com.example.demo.service.impl;

import com.example.demo.pojo.Devices;
import com.example.demo.mapper.DevicesMapper;
import com.example.demo.service.DevicesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@Service
public class DevicesServiceImpl extends ServiceImpl<DevicesMapper, Devices> implements DevicesService {

    @Resource
    private DevicesMapper devicesMapper;

    @Override
    public void deleteDeviceBySn(String sn) {
        Map<String,Object> map = new HashMap<>();
        map.put("sn",sn);

        System.out.println("删除设备sn号为："  + sn);
        devicesMapper.deleteByMap(map);

    }

    @Override
    public void findDevicesBySn(String snId) {
        Map<String,Object> map = new HashMap<>();
        map.put("sn",snId);

        List<Devices> devicesList = devicesMapper.selectByMap(map);


        devicesList.forEach(System.out::println);

    }
}
