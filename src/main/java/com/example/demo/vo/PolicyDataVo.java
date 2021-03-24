package com.example.demo.vo;

import com.example.demo.pojo.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PolicyDataVo {


    private List<Firewalls> firewall;


    private PolicyPhoneGlobal global;


    private PolicyPhoneCommon common;

    private PolicyPhoneOthers other;

    private Policys policys;

}
