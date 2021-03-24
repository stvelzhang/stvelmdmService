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
@ApiModel(value="PolicyPhoneCommon对象", description="")
public class PolicyPhoneCommon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String commonName;

    //使用JsonProperty 是因为前后端分离，前端开发也是参照数据库来命名，为了大家的统一参照物即数据库，前端传过来的数据是数据库的字段命名，使用这边接收需要别名处理一下。
    @JsonProperty("disallow_usb_file_transfer")
    @ApiModelProperty(value = "禁用usb传输文件")
    private String disallowUsbFileTransfer;

    @JsonProperty("disallow_adjust_volume")
    @ApiModelProperty(value = "禁止调节音量")
    private String disallowAdjustVolume;

    @JsonProperty("disallow_install_apps")
    @ApiModelProperty(value = "禁止在手机上再安装apk")
    private String disallowInstallApps;

    @JsonProperty("disallow_uninstall_apps")
    @ApiModelProperty(value = "禁止卸载手机上的apk")
    private String disallowUninstallApps;

    @JsonProperty("disallow_bluetooth")
    @ApiModelProperty(value = "禁用蓝牙")
    private String disallowBluetooth;

    @JsonProperty("disallow_share_location")
    @ApiModelProperty(value = "禁止位置分享")
    private String disallowShareLocation;

    @JsonProperty("disallow_config_cell_broadcasts")
    @ApiModelProperty(value = "禁止配置小区广播")
    private String disallowConfigCellBroadcasts;

    @JsonProperty("disallow_config_mobile_networks")
    @ApiModelProperty(value = "禁止配置数据流量")
    private String disallowConfigMobileNetworks;

    @JsonProperty("disallow_config_bluetooth")
    @ApiModelProperty(value = "禁止配置蓝牙")
    private String disallowConfigBluetooth;

    @JsonProperty("disallow_bluetooth_sharing")
    @ApiModelProperty(value = "禁止蓝牙分享")
    private String disallowBluetoothSharing;

    @JsonProperty("disallow_remove_user")
    @ApiModelProperty(value = "禁止移除用户账户")
    private String disallowRemoveUser;

    @JsonProperty("disallow_config_vpn")
    @ApiModelProperty(value = "禁止 配置vpn")
    private String disallowConfigVpn;

    @JsonProperty("disallow_config_tethering")
    @ApiModelProperty(value = "禁止网络配置")
    private String disallowConfigTethering;

    @JsonProperty("disallow_factory_reset")
    @ApiModelProperty(value = "禁止恢复出厂设置")
    private String disallowFactoryReset;

    @JsonProperty("disallow_add_user")
    @ApiModelProperty(value = "禁止添加用户")
    private String disallowAddUser;

    @JsonProperty("disallow_sms")
    @ApiModelProperty(value = "禁止短信功能")
    private String disallowSms;

    @JsonProperty("disallow_set_wallpaper")
    @ApiModelProperty(value = "禁止设置壁纸")
    private String disallowSetWallpaper;

    @JsonProperty("disallow_camera")
    @ApiModelProperty(value = "禁止使用摄像头")
    private String disallowCamera;


    @JsonProperty("disallow_data_roaming")
    @ApiModelProperty(value = "禁止数据流量")
    private String disallowDataRoaming;

    @JsonProperty("install_non_market_apps")
    @ApiModelProperty(value = "是否可以安装未知来源apk")
    private String installNonMarketApps;


}
