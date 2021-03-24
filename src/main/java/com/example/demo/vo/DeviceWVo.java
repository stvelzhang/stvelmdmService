package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class DeviceWVo {

    private Integer pageNum;

    private Integer pageSize;

    private String sn;

    private String prdModel;

    private String gupName;

    private String policy;


}
