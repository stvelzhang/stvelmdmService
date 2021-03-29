package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.Policys;
import com.example.demo.pojo.TaskTime;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.TaskTimeService;
import com.example.demo.vo.PolicyDataVo;
import com.example.demo.vo.TaskReqWVo;
import javafx.concurrent.Task;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-25
 */
@RestController
@CrossOrigin
@RequestMapping("/tasktime")
public class TaskTimeController {

    @Resource
    TaskTimeService taskTimeService;

    @CrossOrigin
    @PostMapping("/Add")
    public @ResponseBody
    WebAppResponse SavePolicy(@RequestBody List<TaskTime> taskTimeList){


        taskTimeService.saveTask(taskTimeList);

        return WebAppResponse.success();
    }

    @CrossOrigin
    @PostMapping("/list")
    public @ResponseBody
    TableDataInfo getTasks(@RequestBody TaskReqWVo taskReqWVo){


        IPage<TaskTime> taskTimeIPage  = taskTimeService.getTasksWeb(taskReqWVo);


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(taskTimeIPage.getRecords());
        rspData.setTotal(taskTimeIPage.getTotal());

        return rspData;
    }

    @CrossOrigin
    @PostMapping ("/delete")
    public @ResponseBody WebAppResponse delTask(@RequestBody TaskTime taskTime){

        int result = taskTimeService.deleteTimeTaskWeb(taskTime);

        System.out.println("result:: " + result);
        if(result == 0){
            return WebAppResponse.error("删除失败");
        }else{
            return WebAppResponse.successex("删除成功");
        }

    }

}

