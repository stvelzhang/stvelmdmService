package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.AlarmContact;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-30
 */
public interface AlarmContactMapper extends BaseMapper<AlarmContact> {

    IPage<AlarmContact> getAlarmContacts(IPage<AlarmContact> page, @Param("product") String product, @Param("namePhoneEmail") String namePhoneEmail);

}
