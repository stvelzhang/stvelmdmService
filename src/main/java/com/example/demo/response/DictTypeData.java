package com.example.demo.response;

import java.io.Serializable;
import java.util.List;

/**
 * 表格分页数据对象
 * 
 * @author stvelzhang 20210311
 */
public class DictTypeData implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 列表数据 */
    private List<?> productsList;

    /** 列表数据 */
    private List<?> policysList;

    /** 列表数据 */
    private List<?> groupsList;

    /** 消息状态码 */
    private int code;

    /** 消息内容 */
    private String msg;

    /**
     * 表格数据对象
     */
    public DictTypeData()
    {
    }

    public DictTypeData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setProductsList(List<?> productsList) {
        this.productsList = productsList;
    }

    public void setPolicysList(List<?> policysList) {
        this.policysList = policysList;
    }

    public void setGroupsList(List<?> groupsList) {
        this.groupsList = groupsList;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
