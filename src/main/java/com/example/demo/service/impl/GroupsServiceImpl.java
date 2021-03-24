package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.pojo.Groups;
import com.example.demo.mapper.GroupsMapper;
import com.example.demo.service.GroupsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.pojo.DistTypeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@Service
public class GroupsServiceImpl extends ServiceImpl<GroupsMapper, Groups> implements GroupsService {

    @Resource
    GroupsMapper groupsMapper;

    @Override
    public List<DistTypeVo> findGroupsName() {

        List<DistTypeVo> distTypeVoList =  groupsMapper.findGroupsName();

        distTypeVoList.forEach(System.out::println);

        return distTypeVoList;
    }
}
