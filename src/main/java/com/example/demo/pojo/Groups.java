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
@ApiModel(value="Groups对象", description="")
public class Groups implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "分组名称")
    private String gupName;

    @ApiModelProperty(value = "组密码")
    private String gupSecret;

    @ApiModelProperty(value = "策略名称")
    private String policy;

    @ApiModelProperty(value = "分组下的绑定设备数量")
    private String deviceCount;

    @ApiModelProperty(value = "产品项目名称")
    private String prdModel;

    @ApiModelProperty(value = "产品项目渠道公司名")
    private String channel;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "删除提示 0 正常 1删除")
    private Integer isDelete;


}
