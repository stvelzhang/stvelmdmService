package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@ApiModel(value="Policys对象", description="")
public class Policys implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "策略名")
    private String policy;

    @JsonProperty("phone_common")
    private String phoneCommon;

    @JsonProperty("phone_global")
    private String phoneGlobal;

    @JsonProperty("phone_others")
    private String phoneOthers;

    private String firewall;

    private String tasktime;

    private String policyF;

    private String policyG;

    @TableField(fill = FieldFill.INSERT)
    @JsonProperty("create_time")
    private Date createTime;

    @JsonProperty("create_user")
    private String createUser;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    private String updateUser;

    @ApiModelProperty(value = "删除表示。1，删除。0，正常数据")
    private Integer isDelete;


}
