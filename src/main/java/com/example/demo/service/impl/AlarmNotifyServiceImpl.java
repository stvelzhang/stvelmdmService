package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.AlarmNotify;
import com.example.demo.mapper.AlarmNotifyMapper;
import com.example.demo.service.AlarmNotifyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.vo.TaskReqWVo;
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

    @Override
    public IPage<AlarmNotify> getAlarmNotifyWeb(TaskReqWVo taskReqWVo) {

        return alarmNotifyMapper.findAlarmNotifys(new Page<AlarmNotify>(taskReqWVo.getPageNum(),taskReqWVo.getPageSize()),taskReqWVo.getProduct(),taskReqWVo.getTaskName());


    }

    @Override
    public int deleteAlarmNotifyWeb(AlarmNotify alarmNotify) {
        QueryWrapper<AlarmNotify> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("alarm_notify_name", alarmNotify.getAlarmNotifyName())
                .eq("product",alarmNotify.getProduct())
                .eq("alarm_method",alarmNotify.getAlarmMethod());

        return alarmNotifyMapper.delete(queryWrapper);

    }

    @Override
    public int updateAlarmNotify(AlarmNotify alarmNotify) {

        return alarmNotifyMapper.updateAlarmNotify(alarmNotify);
    }
}
