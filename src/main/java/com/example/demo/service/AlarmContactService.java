package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.AlarmContact;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.DeviceTemplate;
import com.example.demo.pojo.DeviceTemplateVo;
import com.example.demo.vo.TaskReqWVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-30
 */
public interface AlarmContactService extends IService<AlarmContact> {

    int saveAlarmContact(AlarmContact alarmContact);
    IPage<AlarmContact> getAlarmContactWeb(TaskReqWVo taskReqWVo);
    int deleteAlarmContactWeb(AlarmContact alarmContact);

}
