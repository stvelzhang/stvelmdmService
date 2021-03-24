package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Devices;
import com.example.demo.pojo.DistTypeVo;
import com.example.demo.pojo.Policys;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.DeviceWVo;
import com.example.demo.vo.PolicyWVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface PolicysService extends IService<Policys> {
        List<DistTypeVo> findPolicyName();
        IPage<Policys> getPolicysWeb(PolicyWVo policyWVo);
        int deletePolicysWeb(Policys policys);
}
