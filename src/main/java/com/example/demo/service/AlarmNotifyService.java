package com.example.demo.service;

import com.example.demo.pojo.AlarmNotify;
import com.baomidou.mybatisplus.extension.service.IService;

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

}
