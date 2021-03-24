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
@ApiModel(value="PolicyPhoneOthers对象", description="")
public class PolicyPhoneOthers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @JsonProperty("othername")
    private String othersName;

    @ApiModelProperty(value = "隐藏那些apk，包名填写")
    @JsonProperty("hide_app")
    private String hideApp;

    @ApiModelProperty(value = "一定显示那些apk，包名填写")
    @JsonProperty("show_app")
    private String showApp;

    @ApiModelProperty(value = "那些apk不能卸载，包名填写")
    @JsonProperty("block_uninstall")
    private String blockUninstall;

    @JsonProperty("black")
    @ApiModelProperty(value = "应用黑名单")
    private String blackListApps;

    @JsonProperty("white")
    @ApiModelProperty(value = "应用白名单")
    private String whiteListApps;

    @JsonProperty("mute_volume")
    @ApiModelProperty(value = "手机静音")
    private String muteVolume;

    @JsonProperty("disable_statusbar")
    @ApiModelProperty(value = "状态栏是否显示")
    private String disableStatusbar;

    @JsonProperty("screen_capture")
    @ApiModelProperty(value = "是否可以截屏")
    private String screenCapture;

    @JsonProperty("global_app_permission")
    @ApiModelProperty(value = "应用权限申请策略， 拒绝、同意 、弹框授权 三种方式")
    private String globalAppPermission;


}
