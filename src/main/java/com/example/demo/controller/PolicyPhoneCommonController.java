package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.*;
import com.example.demo.response.DictTypeDatainfo;
import com.example.demo.response.PolicyColNameData;
import com.example.demo.response.PolicyItemData;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.*;
import com.example.demo.utils.BeanMap;
import com.example.demo.vo.DeviceWVo;
import com.example.demo.vo.PolicyDataVo;
import com.example.demo.vo.PolicyWVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
@RequestMapping("/policy")
public class PolicyPhoneCommonController {

    @Resource
    PolicyPhoneCommonService  phoneCommonService;

    @Resource
    PolicyPhoneGlobalService phoneGlobalService;

    @Resource
    PolicyPhoneOthersService phoneOthersService;

    @Resource
    FirewallsService firewallsService;

    @Resource
    PolicysService policysService;

    @GetMapping("/colnames")
    public @ResponseBody
    PolicyColNameData getcolumnNames(){

        List<columnNameVo> columnNameVos = phoneCommonService.findcolumnName();

        PolicyColNameData respdata = new PolicyColNameData().builder().code(HttpStatus.SUCCESS)
                .colNameList(columnNameVos)
                .msg("数据获取成功")
                .build();

        return respdata;
    }

    @CrossOrigin
    @PostMapping ("/Add")
    public @ResponseBody
    WebAppResponse SavePolicy(@RequestBody PolicyDataVo policyDataVo){


        try {
            phoneCommonService.savePolicy(policyDataVo);
        }catch (Exception e){
            System.out.println("controller---done--exception:" + e.getMessage());
            return WebAppResponse.error(e.getMessage());
        }

        return WebAppResponse.success();
    }

    @CrossOrigin
    @PostMapping ("/list")
    public @ResponseBody TableDataInfo getPolicys(@RequestBody PolicyWVo policyWVo){

        IPage<Policys> policysIPage = policysService.getPolicysWeb(policyWVo);
        List<Policys> policys =  policysIPage.getRecords();


        TableDataInfo rspData = new TableDataInfo();

        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(policys);
        rspData.setTotal(policysIPage.getTotal());

        return rspData;
    }

    @CrossOrigin
    @PostMapping ("/delete")
    public @ResponseBody WebAppResponse delPolicys(@RequestBody Policys policys){

        int result = policysService.deletePolicysWeb(policys);

        System.out.println("result:: " + result);
        if(result == 0){
            return WebAppResponse.error("删除失败");
        }else{
            return WebAppResponse.successex("删除成功");
        }


    }

    @CrossOrigin
    @PostMapping ("/item")
    public @ResponseBody
    PolicyItemData getPolicyItem(@RequestBody Policys policys){

        PolicyDataVo dataVo = phoneCommonService.findPolicyItem(policys);


        PolicyItemData rspData =  new PolicyItemData().builder().code(HttpStatus.SUCCESS)
                .msg("查询成功")
                .common(dataVo.getCommon())
                .other(dataVo.getOther())
                .firewall(dataVo.getFirewall())
                .global(dataVo.getGlobal())
                .policys(dataVo.getPolicys())
                .build();



        return  rspData;
    }


}

