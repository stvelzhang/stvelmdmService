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
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TaskTime对象", description="")
public class TaskTime implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "自定义的定时任务")
    private String taskName;

    @ApiModelProperty(value = "定时任务的目标设备")
    private String taskDevice;

    private String taskCrontime;

    @ApiModelProperty(value = "执行方式 1.重复执行 2.单次执行 3.按时间间隔循环执行")
    private String taskMethod;

    @ApiModelProperty(value = "执行下的 附属参数数据")
    private String execData;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "删除标示  0正常 1删除")
    private Integer isDelete;

    @ApiModelProperty(value = "重复执行方式下的 星期")
    private String execDtweek;

    @ApiModelProperty(value = "执行的操作名，即定时任务操作")
    private String execMode;

    @ApiModelProperty(value = "间隔执行方式下的 分钟 步长")
    private String execDtstep;

    @ApiModelProperty(value = "重复执行方式下的 时间")
    private String execDtreport;

    @ApiModelProperty(value = "单次执行方式下的 时间")
    private String execDtsigle;

    @ApiModelProperty(value = "间隔循环执行方式下的 时间")
    private String execDtinterval;

    @ApiModelProperty(value = "任务创建人")
    private String createUser;

    @ApiModelProperty(value = "任务是否开启状态")
    private String taskStatus;


    private String modeName;


    private String methodName;


}
