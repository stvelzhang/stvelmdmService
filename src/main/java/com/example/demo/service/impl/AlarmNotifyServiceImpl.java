package com.example.demo.service.impl;

import com.example.demo.pojo.AlarmNotify;
import com.example.demo.mapper.AlarmNotifyMapper;
import com.example.demo.service.AlarmNotifyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-04-01
 */
@Service
public class AlarmNotifyServiceImpl extends ServiceImpl<AlarmNotifyMapper, AlarmNotify> implements AlarmNotifyService {

    @Resource
    AlarmNotifyMapper alarmNotifyMapper;

    @Override
    public int saveAlarmNotify(AlarmNotify alarmNotify) {



        return alarmNotifyMapper.insert(alarmNotify);
    }
}
