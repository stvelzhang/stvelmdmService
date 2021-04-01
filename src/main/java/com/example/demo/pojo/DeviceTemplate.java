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
 * @since 2021-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DeviceTemplate对象", description="")
public class DeviceTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "模板名称")
    private String templateName;

    @ApiModelProperty(value = "模板设备使用者，可以多个项目使用一个模板")
    private String templateDevice;

    @ApiModelProperty(value = "数据上报方式，2 边缘计算、4云轮询 6，二合一")
    private String templateMethod;

    @ApiModelProperty(value = "上报数据名称")
    private String nodeName;

    @ApiModelProperty(value = "上报数据属性名")
    private String dataNodeName;

    private Integer isDelete;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "模板 上报数据属性是否开启了报警规则，0 未设置报警、2 设置了但是没有开启 4.开启了报警")
    private String alarmEnable;


}
