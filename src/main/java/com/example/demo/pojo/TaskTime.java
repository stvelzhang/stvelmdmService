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
@ApiModel(value="TaskTime对象", description="")
public class TaskTime implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String taskName;

    private String taskCrontime;

    private String taskData;

    @ApiModelProperty(value = "执行方式 1.重复执行 2.单次执行 3.按时间间隔循环执行")
    private Integer taskMode;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "删除标示  0正常 1删除")
    private Integer isDelete;


}
