package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.Devices;
import com.example.demo.mapper.DevicesMapper;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.DevicesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.vo.DeviceVo;
import com.example.demo.vo.DeviceWVo;
import com.sun.javafx.collections.MappingChange;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Resource
    protected Mapper dozerMapper;

    @Override
    public void deleteDeviceById(Integer id) {
        devicesMapper.deleteById(id);
    }

    @Override
    public void deleteDeviceBySn(String sn) {
        Map<String,Object> map = new HashMap<>();
        map.put("sn",sn);

        System.out.println("删除设备sn号为："  + sn);
        devicesMapper.deleteByMap(map);

    }

    @Override
    public List<Devices> findDevicesBySn(String snId) {
        Map<String,Object> map = new HashMap<>();
        map.put("sn",snId);

        List<Devices> devicesList = devicesMapper.selectByMap(map);


        devicesList.forEach(System.out::println);

        return  devicesList;
    }

    @Override
    public void findDevices(DeviceVo deviceVo) {

        QueryWrapper<Devices> queryWrapper = new QueryWrapper<>();
/*
        queryWrapper.eq("prd_model",deviceVo.getPrdModel())
                .eq("sn",deviceVo.getSn());
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/

        /*

        queryWrapper.isNull("policy")
                .eq("prd_model","s9863a1h10_10_android");
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/

       /*

        queryWrapper.isNull("dev_user");

        Integer count =  devicesMapper.selectCount(queryWrapper);
        System.out.println(count);*/
 /*


        queryWrapper.inSql("id","select id from devices where id < 3");
        List<Object> objectList = devicesMapper.selectObjs(queryWrapper);
        objectList.forEach(System.out::println);*/

       /*
        queryWrapper.isNull("policy")
                .eq("prd_model","s9863a1h10_10_android");
        int result =  devicesMapper.delete(queryWrapper);
        System.out.println("删除的记录有：" + result);*/

        /*//指定查询结果字段
        queryWrapper.select("sn","policy","gup_name")
                .eq("prd_model","ums512_1h10_10_8003");
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/


        //模糊查询
       /* queryWrapper.select("sn","prd_model","gup_name")
                .like("prd_model","1h10")
                .isNotNull("gup_name");
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/


       // devicesMapper.findDevicesDynamic(deviceVo.getPrdModel(),deviceVo.getGupName()).forEach(System.out::println);
        IPage<Devices> data = devicesMapper.findDevicesDynamic(new Page<Devices>(2,3) , deviceVo.getPrdModel(),deviceVo.getGupName());

        System.out.println("总页数：" + data.getPages());
        System.out.println("总记录数：" + data.getTotal());

        List<Devices> devicesList = data.getRecords();
        devicesList.forEach(System.out::println);

       /* queryWrapper.eq("prd_model",deviceVo.getPrdModel())
                .eq("gup_name",deviceVo.getGupName())
                .orderByDesc("gup_name");

        Page<Devices> page = new Page<>(1,3,false);

        devicesMapper.selectPage(page,queryWrapper);

        System.out.println("总页数：" + page.getPages());
        System.out.println("总记录数：" + page.getTotal());

        List<Devices> devicesList = page.getRecords();
        devicesList.forEach(System.out::println);*/


    }


    @Override
    public IPage<Devices> findDevicesWeb(DeviceWVo deviceWVo) {

        //QueryWrapper<Devices> queryWrapper = new QueryWrapper<>();

        /*
        queryWrapper.eq("prd_model",deviceVo.getPrdModel())
                .eq("sn",deviceVo.getSn());
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);
        */

        /*

        queryWrapper.isNull("policy")
                .eq("prd_model","s9863a1h10_10_android");
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/

       /*

        queryWrapper.isNull("dev_user");

        Integer count =  devicesMapper.selectCount(queryWrapper);
        System.out.println(count);*/
 /*


        queryWrapper.inSql("id","select id from devices where id < 3");
        List<Object> objectList = devicesMapper.selectObjs(queryWrapper);
        objectList.forEach(System.out::println);*/

       /*
        queryWrapper.isNull("policy")
                .eq("prd_model","s9863a1h10_10_android");
        int result =  devicesMapper.delete(queryWrapper);
        System.out.println("删除的记录有：" + result);*/

        /*//指定查询结果字段
        queryWrapper.select("sn","policy","gup_name")
                .eq("prd_model","ums512_1h10_10_8003");
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/


        //模糊查询
       /* queryWrapper.select("sn","prd_model","gup_name")
                .like("prd_model","1h10")
                .isNotNull("gup_name");
        devicesMapper.selectList(queryWrapper).forEach(System.out::println);*/


        // devicesMapper.findDevicesDynamic(deviceVo.getPrdModel(),deviceVo.getGupName()).forEach(System.out::println);
        IPage<Devices> data = devicesMapper.findDevicesDynamicWeb(new Page<Devices>(deviceWVo.getPageNum(),deviceWVo.getPageSize()) , deviceWVo.getPrdModel(),deviceWVo.getGupName(),deviceWVo.getPolicy(),deviceWVo.getSn());

        System.out.println("总页数：" + data.getPages());
        System.out.println("总记录数：" + data.getTotal());

        List<Devices> devicesList = data.getRecords();
        devicesList.forEach(System.out::println);

       /* queryWrapper.eq("prd_model",deviceVo.getPrdModel())
                .eq("gup_name",deviceVo.getGupName())
                .orderByDesc("gup_name");

        Page<Devices> page = new Page<>(1,3,false);

        devicesMapper.selectPage(page,queryWrapper);

        System.out.println("总页数：" + page.getPages());
        System.out.println("总记录数：" + page.getTotal());

        List<Devices> devicesList = page.getRecords();
        devicesList.forEach(System.out::println);*/

        return data;
    }

    @Override
    public IPage<Devices> getDevicePolicysWeb(DeviceWVo deviceWVo) {

        QueryWrapper<Devices> queryWrapper = new QueryWrapper<>();

        IPage<Devices> data = devicesMapper.findDevicePolicysDynamicWeb(new Page<Devices>(deviceWVo.getPageNum(),deviceWVo.getPageSize()) , deviceWVo.getPrdModel(),deviceWVo.getGupName(),deviceWVo.getPolicy(),deviceWVo.getSn());

        System.out.println("总页数：" + data.getPages());
        System.out.println("总记录数：" + data.getTotal());

        List<Devices> devicesList = data.getRecords();
        devicesList.forEach(System.out::println);


        return data;
    }

    @Override
    public void saveDevice(DeviceVo deviceVo) {

        Devices devices = dozerMapper.map(deviceVo,Devices.class);



        int result = devicesMapper.insert(devices);

        System.out.println(result);
        System.out.println(devices);
    }

    @Override
    public void updateDevice(DeviceVo deviceVo) {

        //根据UpdateWrapper自定义条件修改数据
        Devices devices = new Devices();
        UpdateWrapper<Devices> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("sn",deviceVo.getSn())
                .eq("prd_model",deviceVo.getPrdModel());

        devices.setPolicy(deviceVo.getPolicy());
        devices.setGupName(deviceVo.getGupName());

        devicesMapper.update(devices,updateWrapper);

        /*
        Devices devices = dozerMapper.map(deviceVo,Devices.class);
        devices.setId(37);
        int result = devicesMapper.updateById(devices);
        System.out.println(result);
        System.out.println(devices);*/
    }
}
