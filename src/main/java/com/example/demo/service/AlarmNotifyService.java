package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.AlarmNotify;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.TaskReqWVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-04-01
 */
public interface AlarmNotifyService extends IService<AlarmNotify> {

    int saveAlarmNotify(AlarmNotify alarmNotify);
    IPage<AlarmNotify> getAlarmNotifyWeb(TaskReqWVo taskReqWVo);
    int deleteAlarmNotifyWeb(AlarmNotify alarmNotify);
    int updateAlarmNotify(AlarmNotify alarmNotify);

}
