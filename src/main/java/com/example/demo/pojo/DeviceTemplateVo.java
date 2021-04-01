package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author stvelzhang
 * @since 2021-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DeviceTemplate对象", description="")
public class DeviceTemplateVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "模板名称")
    private String templateName;

    @ApiModelProperty(value = "模板设备使用者，可以多个项目使用一个模板")
    private String templateDevice;

    @ApiModelProperty(value = "数据上报方式，2 边缘计算、4云轮询 6，二合一")
    private String templateMethod;


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


    private String nodeCount;


}
