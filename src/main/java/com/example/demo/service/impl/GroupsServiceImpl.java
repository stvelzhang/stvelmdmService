package com.example.demo.service.impl;

import com.example.demo.pojo.Groups;
import com.example.demo.mapper.GroupsMapper;
import com.example.demo.service.GroupsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
