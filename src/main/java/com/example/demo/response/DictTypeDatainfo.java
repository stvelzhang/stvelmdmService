package com.example.demo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 表格分页数据对象
 * 
 * @author ruoyi
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DictTypeDatainfo implements Serializable
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


}
