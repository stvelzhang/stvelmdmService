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
 * @since 2021-04-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AlarmNotify对象", description="")
public class AlarmNotify implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "报警通知名称")
    private String alarmNotifyName;

    @ApiModelProperty(value = "报警通知是否开启，")
    private Integer enable;

    @ApiModelProperty(value = "报警通知的具体上报数据参数名")
    private String nodeName;

    @ApiModelProperty(value = "报警通知的针对那个项目")
    private String product;

    @ApiModelProperty(value = "报警通知的具体上报数据名称")
    private String dataNodeName;

    @ApiModelProperty(value = "通知的推送机制：仅第一次推送 、报警沉默时间")
    private String notifyPushType;

    @ApiModelProperty(value = "选择通知推送机制的 报警沉默时间 的分钟值")
    private String notifySilenSec;

    @ApiModelProperty(value = "报警的方式： 短信 微信 邮箱 ，可多选模式")
    private String alarmMethod;

    @ApiModelProperty(value = "报警联系人")
    private String alarmContacts;

    private Integer isDelete;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
