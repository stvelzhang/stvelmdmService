package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.AlarmRulesMapper;
import com.example.demo.pojo.*;
import com.example.demo.mapper.DeviceTemplateMapper;
import com.example.demo.service.DeviceTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.vo.DeviceTempleDataVo;
import com.example.demo.vo.TaskReqWVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-29
 */
@Service
public class DeviceTemplateServiceImpl extends ServiceImpl<DeviceTemplateMapper, DeviceTemplate> implements DeviceTemplateService {

    @Resource
    DeviceTemplateMapper deviceTemplateMapper;

    @Resource
    AlarmRulesMapper alarmRulesMapper;

    @Override
    public void saveTemplate(DeviceTempleDataVo deviceTempleDataVo) {

        List<DeviceTemplate> deviceTemplates = deviceTempleDataVo.getDeviceTemplate();
        List<AlarmRules> alarmRules = deviceTempleDataVo.getAlarmRuleInfo();
        System.out.println(deviceTemplates);
        System.out.println(alarmRules);

        for (DeviceTemplate item: deviceTemplates
                ) {
            deviceTemplateMapper.insert(item);
        }

        for (AlarmRules item: alarmRules
                ) {
            alarmRulesMapper.insert(item);
        }


    }

    @Override
    public IPage<DeviceTemplateVo> getTemplatesWeb(TaskReqWVo taskReqWVo) {



        IPage<DeviceTemplateVo> taskTimeIPage = deviceTemplateMapper.findTemplates(new Page<DeviceTemplateVo>(taskReqWVo.getPageNum(),taskReqWVo.getPageSize()),taskReqWVo.getProduct(),taskReqWVo.getTaskName());

        System.out.println("总页数：" + taskTimeIPage.getPages());
        System.out.println("总记录数：" + taskTimeIPage.getTotal());

        List<DeviceTemplateVo> taskTimes = taskTimeIPage.getRecords();
        taskTimes.forEach(System.out::println);

        return taskTimeIPage;

    }

    @Override
    public int deleteTemplateWeb(DeviceTemplate deviceTemplate) {
        return 0;
    }

    //modify for stvelzhang 20210401
    @Override
    public List<DistTypeVo> findNodeDistType(String productName) {

        return deviceTemplateMapper.findNodeDistType(productName);
    }
}
