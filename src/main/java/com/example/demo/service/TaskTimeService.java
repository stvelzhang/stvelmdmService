package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Policys;
import com.example.demo.pojo.TaskTime;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.PolicyWVo;
import com.example.demo.vo.TaskReqWVo;
import javafx.concurrent.Task;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-25
 */
public interface TaskTimeService extends IService<TaskTime> {
    void saveTask(List<TaskTime> taskTimes);
    IPage<TaskTime> getTasksWeb(TaskReqWVo taskReqWVo);
    int deleteTimeTaskWeb(TaskTime taskTime);
}
