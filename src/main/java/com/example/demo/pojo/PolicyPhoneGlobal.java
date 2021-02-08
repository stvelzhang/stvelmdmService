package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="PolicyPhoneGlobal对象", description="")
public class PolicyPhoneGlobal implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String globalName;

    @ApiModelProperty(value = "是否开启自动时间日期")
    private String autoTime;

    @ApiModelProperty(value = "是否开启自动时区")
    private String autoTimeZone;

    @ApiModelProperty(value = "是否开启adb功能")
    private String adbEnabled;

    @ApiModelProperty(value = "设置wifi的休眠模式")
    private String wifiSleepPolicy;


}
