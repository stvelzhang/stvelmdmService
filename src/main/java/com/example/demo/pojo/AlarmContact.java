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
 * 报警联系人
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AlarmContact对象", description="报警联系人")
public class AlarmContact implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "联系人姓名")
    private String alarmName;

    @ApiModelProperty(value = "所属项目")
    private String product;

    @ApiModelProperty(value = "手机")
    private String alarmPhone;

    @ApiModelProperty(value = "邮箱")
    private String alarmEmail;

    @ApiModelProperty(value = "微信")
    private String alarmWecat;

    @ApiModelProperty(value = "备注")
    private String alarmRemark;

    private Integer isDelete;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
