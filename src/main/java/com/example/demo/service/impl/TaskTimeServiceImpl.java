package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.Firewalls;
import com.example.demo.pojo.Policys;
import com.example.demo.pojo.TaskTime;
import com.example.demo.mapper.TaskTimeMapper;
import com.example.demo.service.TaskTimeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
 * @since 2021-03-25
 */
@Service
public class TaskTimeServiceImpl extends ServiceImpl<TaskTimeMapper, TaskTime> implements TaskTimeService {

    @Resource
    TaskTimeMapper taskTimeMapper;


    @Override
    public void saveTask(List<TaskTime> taskTimes) {

        System.out.println(taskTimes);

        for (TaskTime item: taskTimes
                ) {
            taskTimeMapper.insert(item);
        }


    }

    @Override
    public IPage<TaskTime> getTasksWeb(TaskReqWVo taskReqWVo) {
        IPage<TaskTime> taskTimeIPage = taskTimeMapper.findTasks(new Page<TaskTime>(taskReqWVo.getPageNum(),taskReqWVo.getPageSize()),taskReqWVo.getProduct(),taskReqWVo.getTaskName());

        System.out.println("总页数：" + taskTimeIPage.getPages());
        System.out.println("总记录数：" + taskTimeIPage.getTotal());

        List<TaskTime> taskTimes = taskTimeIPage.getRecords();
        taskTimes.forEach(System.out::println);

        return taskTimeIPage;
    }

    @Override
    public int deleteTimeTaskWeb(TaskTime taskTime) {
        QueryWrapper<TaskTime> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("task_name",taskTime.getTaskName())
                .eq("exec_mode",taskTime.getExecMode())
                .eq("task_method",taskTime.getTaskMethod())
                .eq("task_device",taskTime.getTaskDevice());

        int result = taskTimeMapper.delete(queryWrapper);


        return result;
    }
}
