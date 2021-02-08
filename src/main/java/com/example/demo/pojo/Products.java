package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Products对象", description="")
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "产品项目名称")
    private String prdModel;

    @ApiModelProperty(value = "产品项目秘钥")
    private String prdSecret;

    @ApiModelProperty(value = "产品项目渠道公司名")
    private String channel;

    @ApiModelProperty(value = "1. wifi 2.4G 3.网卡 4.PLC网关 5.nb-iot 6.LoRa 7.有线以太网")
    private Integer netType;

    @ApiModelProperty(value = "rom空间大小")
    private String rom;

    @ApiModelProperty(value = "ram空间大小")
    private String ram;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "删除标示  0正常 1删除")
    private Integer isDelete;


}
