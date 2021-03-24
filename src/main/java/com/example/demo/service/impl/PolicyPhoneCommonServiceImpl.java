package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.exception.CustomException;
import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import com.example.demo.service.PolicyPhoneCommonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.vo.PolicyDataVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class PolicyPhoneCommonServiceImpl extends ServiceImpl<PolicyPhoneCommonMapper, PolicyPhoneCommon> implements PolicyPhoneCommonService {

    @Resource
    PolicyPhoneCommonMapper policyPhoneCommonMapper;

    @Resource
    PolicyPhoneGlobalMapper  policyPhoneGlobalMapper;

    @Resource
    PolicyPhoneOthersMapper policyPhoneOthersMapper;

    @Resource
    FirewallsMapper firewallsMapper;

    @Resource
    PolicysMapper policysMapper;

    @Override
    public List<columnNameVo> findcolumnName() {
        List<columnNameVo> columnNameVos =  policyPhoneCommonMapper.findcolumnName();
        System.out.println("columnList::" + columnNameVos);

        return columnNameVos;
    }

    @Override
    //事务 异常处理
    @Transactional(rollbackFor = Exception.class)
    public String savePolicy(PolicyDataVo policyDataVo) {
        List<Firewalls> firewalls = policyDataVo.getFirewall();

        PolicyPhoneOthers phoneOthers =  policyDataVo.getOther();
        PolicyPhoneCommon phoneCommon =  policyDataVo.getCommon();
        PolicyPhoneGlobal phoneGlobal= policyDataVo.getGlobal();

        Policys policys =  policyDataVo.getPolicys();

        QueryWrapper<Policys> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("policy",policys.getPolicy());
        Integer policy_count =  policysMapper.selectCount(queryWrapper);

        if(policy_count > 0){
            throw new CustomException("已经存在这个策略了，不能再创建",2);
        }
  /*      System.out.println( "----global::" + phoneGlobal.toString() + "----other::" + phoneOthers.toString()  + "----policys::" + policys);

        firewalls.forEach(System.out::println);
        commonList.forEach(System.out::println);*/

        for (Firewalls item: firewalls
             ) {
            firewallsMapper.insert(item);
        }

        policyPhoneGlobalMapper.insert(phoneGlobal);
        policysMapper.insert(policys);
        policyPhoneOthersMapper.insert(phoneOthers);
        policyPhoneCommonMapper.insert(phoneCommon);


        return null;
    }

    @Override
    public PolicyDataVo findPolicyItem(Policys policys) {

        QueryWrapper<Policys> policysQueryWrapper = new QueryWrapper<>();

        policysQueryWrapper.eq("policy", policys.getPolicy())
                .eq("create_user",policys.getCreateUser());

        Policys policys_info =  policysMapper.selectList(policysQueryWrapper).get(0);

        String commonName = policys_info.getPhoneCommon();
        String otherName = policys_info.getPhoneOthers();
        String globalName = policys_info.getPhoneGlobal();
        String firewallName = policys_info.getFirewall();

        System.out.println("commonName:" + commonName + "----otherName ::"+ otherName + "---globalName ::"+ globalName + "---firewallName ::" + firewallName );
        QueryWrapper<PolicyPhoneGlobal> globalQueryWrapper = new QueryWrapper<>();
        QueryWrapper<PolicyPhoneCommon> commonQueryWrapper = new QueryWrapper<>();
        QueryWrapper<PolicyPhoneOthers> othersQueryWrapper = new QueryWrapper<>();
        QueryWrapper<Firewalls> firewallsQueryWrapper = new QueryWrapper<>();


        othersQueryWrapper.eq("others_name",otherName);
        List<PolicyPhoneOthers> phoneOthers_list = policyPhoneOthersMapper.selectList(othersQueryWrapper);
        PolicyPhoneOthers phoneOthers_info = phoneOthers_list.size() > 0 ? phoneOthers_list.get(0): null;

        globalQueryWrapper.eq("global_name",globalName);
        List<PolicyPhoneGlobal> phoneGlobal_list = policyPhoneGlobalMapper.selectList(globalQueryWrapper);
        PolicyPhoneGlobal phoneGlobal_info  = phoneGlobal_list.size() > 0 ? phoneGlobal_list.get(0): null;


        commonQueryWrapper.eq("common_name",commonName);
        List<PolicyPhoneCommon> phoneCommon_list = policyPhoneCommonMapper.selectList(commonQueryWrapper);
        PolicyPhoneCommon phoneCommon_info =  phoneCommon_list.size() > 0 ? phoneCommon_list.get(0): null;

        firewallsQueryWrapper.eq("firewall_name", firewallName);
        List<Firewalls> firewallsList = firewallsMapper.selectList(firewallsQueryWrapper);

        PolicyDataVo dataVo =  new PolicyDataVo();
        dataVo.setCommon(phoneCommon_info);
        dataVo.setFirewall(firewallsList);
        dataVo.setGlobal(phoneGlobal_info);
        dataVo.setOther(phoneOthers_info);
        dataVo.setPolicys(policys_info);

        return dataVo;
    }


}
