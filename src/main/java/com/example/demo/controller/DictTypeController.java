package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.WebAppResponse;
import com.example.demo.constant.HttpStatus;
import com.example.demo.pojo.Devices;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.response.DictTypeData;
import com.example.demo.response.DictTypeDatainfo;
import com.example.demo.response.TableDataInfo;
import com.example.demo.service.DevicesService;
import com.example.demo.service.GroupsService;
import com.example.demo.service.PolicysService;
import com.example.demo.service.ProductsService;
import com.example.demo.vo.DeviceVo;
import com.example.demo.vo.DeviceWVo;
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
@RequestMapping("/dict/type")
public class DictTypeController {


    @Resource
    private GroupsService groupsService;

    @Resource
    private PolicysService policysService;

    @Resource
    private ProductsService productsService;

    @GetMapping ("/optionselect")
    public @ResponseBody DictTypeDatainfo getDevice(){

        List<DistTypeVo> distTypeGroups =  groupsService.findGroupsName();
        List<DistTypeVo> distTypePolicys = policysService.findPolicyName();
        List<DistTypeVo> distTypeProducts = productsService.findProductsName();


        DictTypeDatainfo rspData =  new DictTypeDatainfo().builder().code(HttpStatus.SUCCESS)
                .msg("查询成功")
                .policysList(distTypePolicys)
                .groupsList(distTypeGroups)
                .productsList(distTypeProducts)
                .build();


        return rspData;
    }


}

