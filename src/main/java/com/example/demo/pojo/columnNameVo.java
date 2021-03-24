package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-18
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class columnNameVo {

    //表的 列名 描述
    private String  columndesc;

    //表的 列名
    private String name;

}
