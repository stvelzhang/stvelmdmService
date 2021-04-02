package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.AlarmNotify;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.TaskTime;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-04-01
 */
public interface AlarmNotifyMapper extends BaseMapper<AlarmNotify> {
    IPage<AlarmNotify> findAlarmNotifys(IPage<AlarmNotify> page, @Param("product") String product, @Param("alarmNotifyName") String alarmNotifyName);

    int updateAlarmNotify(AlarmNotify alarmNotify);
}
