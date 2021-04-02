package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.AlarmNotify;
import com.example.demo.pojo.DeviceTemplate;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.AlarmNotifyService;
import com.example.demo.vo.TaskReqWVo;
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


    @CrossOrigin
    @PostMapping("/list")
    public @ResponseBody
    TableDataInfo getTasks(@RequestBody TaskReqWVo taskReqWVo){


        IPage<AlarmNotify> alarmNotifyIPage  = alarmNotifyService.getAlarmNotifyWeb(taskReqWVo);


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(alarmNotifyIPage.getRecords());
        rspData.setTotal(alarmNotifyIPage.getTotal());

        return rspData;
    }


    @CrossOrigin
    @PostMapping ("/delete")
    public @ResponseBody WebAppResponse delAlarmNotify(@RequestBody AlarmNotify alarmNotify){

        int result = alarmNotifyService.deleteAlarmNotifyWeb(alarmNotify);

        System.out.println("result:: " + result);
        if(result == 0){
            return WebAppResponse.error("删除失败");
        }else{
            return WebAppResponse.successex("删除成功");
        }

    }

    /**
     * 状态修改
     */

    @PutMapping("/changeStatus")
    public WebAppResponse changeStatus(@RequestBody AlarmNotify alarmNotify)
    {
        int result =    alarmNotifyService.updateAlarmNotify(alarmNotify);

        if(result == 0){
            return WebAppResponse.error("更新失败");
        }else{
            return WebAppResponse.successex("更新成功");
        }
    }


}

