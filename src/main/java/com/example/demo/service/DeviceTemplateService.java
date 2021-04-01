package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.DeviceTemplate;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.TaskTime;
import com.example.demo.vo.DeviceTempleDataVo;
import com.example.demo.vo.TaskReqWVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-29
 */
public interface DeviceTemplateService extends IService<DeviceTemplate> {
    void saveTemplate(DeviceTempleDataVo deviceTempleDataVo);
    IPage<DeviceTemplateVo> getTemplatesWeb(TaskReqWVo taskReqWVo);
    int deleteTemplateWeb(DeviceTemplate deviceTemplate);
    List<DistTypeVo> findNodeDistType(String productName);

}
