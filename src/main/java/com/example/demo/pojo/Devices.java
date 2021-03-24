package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
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
@ApiModel(value="Devices对象", description="")
public class Devices implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设备mac号或者imei号，或者nid号")
    private String macImeiNid;

    @ApiModelProperty(value = "设备sn号")
    private String sn;

    @ApiModelProperty(value = "产品名称")
    private String prdModel;

    @ApiModelProperty(value = "分组名称")
    private String gupName;

    @ApiModelProperty(value = "策略")
    private String policy;

    //devices 表中没有这个字段，使用这里要用 ，TableField 标识字段，不然要报错
    @TableField(exist = false)
    private String firewall;

    @ApiModelProperty(value = "设备用户名")
    private String devUser;

    @ApiModelProperty(value = "设备密码")
    private String devSecret;

    @ApiModelProperty(value = "设备经纬度")
    private String devLb;

    @ApiModelProperty(value = "设备远程ip地址")
    private String devRemote;

    @ApiModelProperty(value = "设备状态")
    private String devState;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "删除标示  0正常 1删除")
    @TableLogic
    private Integer isDelete;


}
