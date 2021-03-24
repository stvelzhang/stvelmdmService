package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.Devices;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.Policys;
import com.example.demo.mapper.PolicysMapper;
import com.example.demo.service.PolicysService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.vo.PolicyWVo;
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
public class PolicysServiceImpl extends ServiceImpl<PolicysMapper, Policys> implements PolicysService {

    @Resource
    PolicysMapper policysMapper;


    @Override
    public List<DistTypeVo> findPolicyName() {
        List<DistTypeVo>  policysName = policysMapper.findPolicysName();
        return policysName;
    }

    @Override
    public IPage<Policys> getPolicysWeb(PolicyWVo policyWVo) {

        IPage<Policys> data = policysMapper.findPolicys(new Page<Policys>(policyWVo.getPageNum(),policyWVo.getPageSize()) , policyWVo.getPolicy());

        System.out.println("总页数：" + data.getPages());
        System.out.println("总记录数：" + data.getTotal());

        List<Policys> policys = data.getRecords();
        policys.forEach(System.out::println);


        return data;

    }

    @Override
    public int deletePolicysWeb(Policys policys) {

        QueryWrapper<Policys> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("policy",policys.getPolicy())
                .eq("create_user", policys.getCreateUser());

        int result = policysMapper.delete(queryWrapper);

        return result;
    }
}
