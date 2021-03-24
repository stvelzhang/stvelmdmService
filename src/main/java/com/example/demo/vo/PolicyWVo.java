package com.example.demo.vo;

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
 * @since 2021-02-08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PolicyWVo {

    private Integer pageNum;

    private Integer pageSize;

    private String policy;


}
