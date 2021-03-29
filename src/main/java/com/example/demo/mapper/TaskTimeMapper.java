package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.TaskTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-25
 */
public interface TaskTimeMapper extends BaseMapper<TaskTime> {

    IPage<TaskTime> findTasks(IPage<TaskTime> page, @Param("product") String product, @Param("taskName") String taskName);

}
