package com.example.demo.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

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
public class DeviceVo  {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String macImeiNid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String prdModel;

    private String gupName;

    private String policy;

    private String devUser;

    private String devSecret;

    //"设备经纬度"
    private String devLb;

  //设备远程ip地址"
    private String devRemote;

   //设备状态
    private String devState;


}
