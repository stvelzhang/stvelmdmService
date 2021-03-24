package com.example.demo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 数据对象
 * 
 * @author stvelzhang 20210318
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PolicyColNameData implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 表的 列名和描述*/
    private List<?> colNameList;

    public void setColNameList(List<?> colNameList) {
        this.colNameList = colNameList;
    }

    /** 消息状态码 */
    private int code;

    /** 消息内容 */
    private String msg;

}
