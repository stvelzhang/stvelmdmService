package com.example.demo.controller;


import com.example.demo.WebAppResponse;
import com.example.demo.pojo.AlarmNotify;
import com.example.demo.service.AlarmNotifyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stvelzhang
 * @since 2021-04-01
 */
@RestController
@CrossOrigin
@RequestMapping("/alarmNotify")
public class AlarmNotifyController {


    @Resource
    AlarmNotifyService alarmNotifyService;

    @PostMapping("/Add")
    @ResponseBody
    WebAppResponse savaAlarmNotify(@RequestBody AlarmNotify alarmNotify){

        alarmNotifyService.saveAlarmNotify(alarmNotify);

        return  WebAppResponse.success();
    }



}

