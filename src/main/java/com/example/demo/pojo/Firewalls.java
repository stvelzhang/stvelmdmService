package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.lang.reflect.Array;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author stvelzhang
 * @since 2021-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Firewalls对象", description="")
public class Firewalls implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "防火墙名称")
    @JsonProperty("firewall_name")
    private String firewallName;


    @ApiModelProperty(value = "网址的限制")
    private String session;

    @ApiModelProperty(value = "应用包名的限制")
    @JsonProperty("packageName")
    @TableField("packageName")
    private String packagename;

    @ApiModelProperty(value = "网络模式 1 wifi 2 data 3 wifi data")
    private String pattern;

    @ApiModelProperty(value = "排序")
    private String priority;

    @ApiModelProperty(value = "限制的起始时间")
    private String starttime;

    @ApiModelProperty(value = "限制的结束时间")
    private String endtime;


}
