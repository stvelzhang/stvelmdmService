package com.example.demo.mapper;

import com.example.demo.pojo.Groups;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.DistTypeVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface GroupsMapper extends BaseMapper<Groups> {

     List<DistTypeVo> findGroupsName();

}
