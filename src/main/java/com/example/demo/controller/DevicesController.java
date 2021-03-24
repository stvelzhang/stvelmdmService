package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.Devices;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.DevicesService;
import com.example.demo.service.impl.DevicesServiceImpl;
import com.example.demo.vo.DeviceVo;
import com.example.demo.vo.DeviceWVo;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@RestController
@CrossOrigin
@RequestMapping("/devices")
public class DevicesController {


    @Resource
    private DevicesService devicesService;
    @DeleteMapping("/device/{sn}")
    public @ResponseBody
    WebAppResponse deleteDevice(@PathVariable("sn") String sn){

        devicesService.deleteDeviceBySn(sn);

        return WebAppResponse.success();
    }

    @DeleteMapping("/device/")
    public @ResponseBody
    WebAppResponse deleteDevice(){

        devicesService.deleteDeviceById(37);

        return WebAppResponse.success();
    }


    @GetMapping("/device/{sn}")
    public @ResponseBody WebAppResponse getDevice(@PathVariable("sn") String sn){

        List<Devices> devicesList =  devicesService.findDevicesBySn(sn);
        return WebAppResponse.success(devicesList);
    }

    @GetMapping ("/device")
    public @ResponseBody WebAppResponse getDevice(@RequestBody DeviceVo deviceVo){

        devicesService.findDevices(deviceVo);
        return WebAppResponse.success();
    }

    @CrossOrigin
    @PostMapping ("/deviceWeb")
    public @ResponseBody TableDataInfo getDevice(@RequestBody DeviceWVo deviceWVo){

        IPage<Devices> devicesIPage = devicesService.findDevicesWeb(deviceWVo);
        List<Devices> devicesList =  devicesIPage.getRecords();


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(devicesList);
        rspData.setTotal(devicesIPage.getTotal());

        return rspData;
    }


    @CrossOrigin
    @PostMapping ("/devicePolicyWeb")
    public @ResponseBody TableDataInfo getDevicePolicys(@RequestBody DeviceWVo deviceWVo){

        IPage<Devices> devicesIPage = devicesService.getDevicePolicysWeb(deviceWVo);
        List<Devices> devicesList =  devicesIPage.getRecords();


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(devicesList);
        rspData.setTotal(devicesIPage.getTotal());

        return rspData;
    }

    @PostMapping ("/device")
    public @ResponseBody WebAppResponse saveDevice(@RequestBody DeviceVo deviceVo){

        devicesService.saveDevice(deviceVo);
        return WebAppResponse.success();
    }

    @PutMapping ("/device")
    public @ResponseBody WebAppResponse updateDevice(@RequestBody DeviceVo deviceVo){

        devicesService.updateDevice(deviceVo);
        return WebAppResponse.success();
    }
}

