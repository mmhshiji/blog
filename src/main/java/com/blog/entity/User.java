package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * @author 
 * @since 2021-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
      @TableId(value = "user_id", type = IdType.ID_WORKER)
    private Integer userId;

    @ApiModelProperty(value = "用户名")
    private String userUsername;

    @ApiModelProperty(value = "真实姓名")
    private String userRealName;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;

    @ApiModelProperty(value = "用户电子邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户生日")
    private Date userBirthday;

    @ApiModelProperty(value = "用户性别")
    private String userSex;

    @ApiModelProperty(value = "用户限权")
    private String userPower;

    @ApiModelProperty(value = "用户简介")
    private String userMsg;

    @ApiModelProperty(value = "用户注册日期")
    private Date userRegisterDate;

    @ApiModelProperty(value = "用户最近登录日期")
    private Date userLoginDate;

    @ApiModelProperty(value = "用户状态，0 表示未登录，1 表示已登录")
    private String userCondition;

    @ApiModelProperty(value = "用户积分")
    private Integer userGrade;


}
