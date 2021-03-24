package com.example.demo.response;

import com.example.demo.pojo.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 数据对象
 * 
 * @author stvelzhang 20210323
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PolicyItemData implements Serializable
{
    private static final long serialVersionUID = 1L;


    private List<Firewalls> firewall;


    private PolicyPhoneGlobal global;


    private PolicyPhoneCommon common;

    private PolicyPhoneOthers other;

    private Policys policys;

    /** 消息状态码 */
    private int code;

    /** 消息内容 */
    private String msg;

}
