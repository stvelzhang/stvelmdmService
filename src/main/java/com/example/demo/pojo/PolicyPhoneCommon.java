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
@ApiModel(value="PolicyPhoneCommon对象", description="")
public class PolicyPhoneCommon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String commonName;

    @ApiModelProperty(value = "禁用usb传输文件")
    private String disallowUsbFileTransfer;

    @ApiModelProperty(value = "禁止调节音量")
    private String disallowAdjustVolume;

    @ApiModelProperty(value = "禁止在手机上再安装apk")
    private String disallowInstallApps;

    @ApiModelProperty(value = "禁止卸载手机上的apk")
    private String disallowUninstallApps;

    @ApiModelProperty(value = "禁用蓝牙")
    private String disallowBluetooth;

    @ApiModelProperty(value = "禁止位置分享")
    private String disallowShareLocation;

    @ApiModelProperty(value = "禁止配置小区广播")
    private String disallowConfigCellBroadcasts;

    @ApiModelProperty(value = "禁止配置数据流量")
    private String disallowConfigMobileNetworks;

    @ApiModelProperty(value = "禁止配置蓝牙")
    private String disallowConfigBluetooth;

    @ApiModelProperty(value = "禁止蓝牙分享")
    private String disallowBluetoothSharing;

    @ApiModelProperty(value = "禁止移除用户账户")
    private String disallowRemoveUser;

    @ApiModelProperty(value = "禁止 配置vpn")
    private String disallowConfigVpn;

    @ApiModelProperty(value = "禁止网络配置")
    private String disallowConfigTethering;

    @ApiModelProperty(value = "禁止恢复出厂设置")
    private String disallowFactoryReset;

    @ApiModelProperty(value = "禁止添加用户")
    private String disallowAddUser;

    @ApiModelProperty(value = "禁止短信功能")
    private String disallowSms;

    @ApiModelProperty(value = "禁止设置壁纸")
    private String disallowSetWallpaper;

    @ApiModelProperty(value = "禁止使用摄像头")
    private String disallowCamera;

    @ApiModelProperty(value = "禁止数据流量")
    private String disallowDataRoaming;

    @ApiModelProperty(value = "是否可以安装未知来源apk")
    private String installNonMarketApps;


}
