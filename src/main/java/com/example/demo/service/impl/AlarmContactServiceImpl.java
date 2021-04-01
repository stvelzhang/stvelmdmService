package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.AlarmContact;
import com.example.demo.mapper.AlarmContactMapper;
import com.example.demo.service.AlarmContactService;
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
 * @since 2021-03-30
 */
@Service
public class AlarmContactServiceImpl extends ServiceImpl<AlarmContactMapper, AlarmContact> implements AlarmContactService {

    @Resource
    AlarmContactMapper alarmContactMapper;


    @Override
    public int saveAlarmContact(AlarmContact alarmContact) {

        int add_result =  alarmContactMapper.insert(alarmContact);

        return add_result;

    }

    @Override
    public IPage<AlarmContact> getAlarmContactWeb(TaskReqWVo taskReqWVo) {

        IPage<AlarmContact> alarmContactIPage = alarmContactMapper.getAlarmContacts(new Page<AlarmContact>(taskReqWVo.getPageNum(),taskReqWVo.getPageSize()),taskReqWVo.getProduct(),taskReqWVo.getTaskName());
        return alarmContactIPage;
    }

    @Override
    public int deleteAlarmContactWeb(AlarmContact alarmContact) {

        QueryWrapper<AlarmContact> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("alarm_name",alarmContact.getAlarmName())
                .eq("product",alarmContact.getProduct());

        return alarmContactMapper.delete(queryWrapper);

    }
}
