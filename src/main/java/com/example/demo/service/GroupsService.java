package com.example.demo.service;

import com.example.demo.pojo.Groups;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.DistTypeVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface GroupsService extends IService<Groups> {

    List<DistTypeVo> findGroupsName();
}
