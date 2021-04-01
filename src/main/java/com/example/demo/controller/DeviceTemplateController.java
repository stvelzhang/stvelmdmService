package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.DeviceTemplate;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.TaskTime;
import com.example.demo.response.DictTypeDatainfo;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.DeviceTemplateService;
import com.example.demo.vo.DeviceTempleDataVo;
import com.example.demo.vo.TaskReqWVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  设备模板
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-29
 */
@RestController
@CrossOrigin
@RequestMapping("/deviceTemple")
public class DeviceTemplateController {

    @Resource
    DeviceTemplateService deviceTemplateService;

    @CrossOrigin
    @PostMapping("/Add")
    public @ResponseBody
    WebAppResponse SavePolicy(@RequestBody DeviceTempleDataVo deviceTempleDataVo ){


        deviceTemplateService.saveTemplate(deviceTempleDataVo);

        return WebAppResponse.success();
    }

    @CrossOrigin
    @PostMapping("/list")
    public @ResponseBody
    TableDataInfo getTasks(@RequestBody TaskReqWVo taskReqWVo){


        IPage<DeviceTemplateVo> taskTimeIPage  = deviceTemplateService.getTemplatesWeb(taskReqWVo);


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(taskTimeIPage.getRecords());
        rspData.setTotal(taskTimeIPage.getTotal());

        return rspData;
    }

    @CrossOrigin
    @PostMapping ("/delete")
    public @ResponseBody WebAppResponse delTask(@RequestBody DeviceTemplate deviceTemplate){

        int result = deviceTemplateService.deleteTemplateWeb(deviceTemplate);

        System.out.println("result:: " + result);
        if(result == 0){
            return WebAppResponse.error("删除失败");
        }else{
            return WebAppResponse.successex("删除成功");
        }

    }

    @CrossOrigin
    @GetMapping("/NodeDistType/{product}")
    public @ResponseBody DictTypeDatainfo delTask(@PathVariable("product") String product){

        List<DistTypeVo> nodeDistList =  deviceTemplateService.findNodeDistType(product);

        DictTypeDatainfo rspData =  new DictTypeDatainfo().builder().code(HttpStatus.SUCCESS)
                .msg("查询成功")
                .policysList(null)
                .groupsList(nodeDistList)
                .productsList(null)
                .build();


        return rspData;

    }

}

