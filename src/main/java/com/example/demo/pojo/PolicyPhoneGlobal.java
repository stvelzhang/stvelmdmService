package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="PolicyPhoneGlobal对象", description="")
public class PolicyPhoneGlobal implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @JsonProperty("global_name")
    private String globalName;

    @JsonProperty("auto_time")
    @ApiModelProperty(value = "是否开启自动时间日期")
    private String autoTime;

    @JsonProperty("auto_time_zone")
    @ApiModelProperty(value = "是否开启自动时区")
    private String autoTimeZone;

    @JsonProperty("adb_enabled")
    @ApiModelProperty(value = "是否开启adb功能")
    private String adbEnabled;

    @JsonProperty("wifi_sleep_policy")
    @ApiModelProperty(value = "设置wifi的休眠模式")
    private String wifiSleepPolicy;


}
