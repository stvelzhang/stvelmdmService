package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.AlarmContact;
import com.example.demo.pojo.DeviceTemplate;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.AlarmContactService;
import com.example.demo.vo.TaskReqWVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-29
 */
@RestController
@CrossOrigin
@RequestMapping("/alarm")
public class AlarmRulesController {


    @Resource
    AlarmContactService alarmContactService;


    @CrossOrigin
    @PostMapping("/AddContact")
    public @ResponseBody
    WebAppResponse SaveAlarmContact(@RequestBody AlarmContact contact){

        int result =  alarmContactService.saveAlarmContact(contact);
        if(result != 1){
            WebAppResponse.successex("联系人保存失败");
        }


        return WebAppResponse.success();
    }

    @CrossOrigin
    @PostMapping("/list")
    public @ResponseBody
    TableDataInfo getAlarmContacts(@RequestBody TaskReqWVo taskReqWVo){


        IPage<AlarmContact> alarmContactIPage  = alarmContactService.getAlarmContactWeb(taskReqWVo);


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(alarmContactIPage.getRecords());
        rspData.setTotal(alarmContactIPage.getTotal());

        return rspData;
    }

    @PostMapping ("/delete")
    public @ResponseBody WebAppResponse delAlarmContact(@RequestBody AlarmContact alarmContact){

        int result = alarmContactService.deleteAlarmContactWeb(alarmContact);

        System.out.println("result:: " + result);
        if(result == 0){
            return WebAppResponse.error("删除失败");
        }else{
            return WebAppResponse.successex("删除成功");
        }

    }

}

