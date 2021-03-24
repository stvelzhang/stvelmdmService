package com.example.demo.service;

import com.example.demo.pojo.PolicyPhoneCommon;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.Policys;
import com.example.demo.pojo.columnNameVo;
import com.example.demo.vo.PolicyDataVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
public interface PolicyPhoneCommonService extends IService<PolicyPhoneCommon> {
    List<columnNameVo> findcolumnName();

    String savePolicy(PolicyDataVo policyDataVo);

    PolicyDataVo findPolicyItem(Policys policys);
}
