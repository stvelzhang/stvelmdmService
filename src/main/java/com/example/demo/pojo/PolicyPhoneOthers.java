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
@ApiModel(value="PolicyPhoneOthers对象", description="")
public class PolicyPhoneOthers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String othersName;

    @ApiModelProperty(value = "隐藏那些apk，包名填写")
    private String hideApp;

    @ApiModelProperty(value = "一定显示那些apk，包名填写")
    private String showApp;

    @ApiModelProperty(value = "那些apk不能卸载，包名填写")
    private String blockUninstall;

    @ApiModelProperty(value = "应用黑名单")
    private String blackListApps;

    @ApiModelProperty(value = "应用白名单")
    private String whiteListApps;

    @ApiModelProperty(value = "手机静音")
    private String muteVolume;

    @ApiModelProperty(value = "状态栏是否显示")
    private String disableStatusbar;

    @ApiModelProperty(value = "是否可以截屏")
    private String screenCapture;

    @ApiModelProperty(value = "应用权限申请策略， 拒绝、同意 、弹框授权 三种方式")
    private String globalAppPermission;


}
