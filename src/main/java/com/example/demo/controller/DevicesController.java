package com.example.demo.controller;


import com.example.demo.WebAppResponse;
import com.example.demo.service.DevicesService;
import com.example.demo.service.impl.DevicesServiceImpl;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@RestController
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


    @GetMapping("/device/{sn}")
    public @ResponseBody WebAppResponse getDevice(@PathVariable("sn") String sn){

        devicesService.findDevicesBySn(sn);
        return WebAppResponse.success();
    }

}

