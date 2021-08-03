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
@ApiModel(value="Labels对象", description="")
public class Labels implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签ID")
      @TableId(value = "labels_id", type = IdType.AUTO)
    private Long labelsId;

    @ApiModelProperty(value = "标签名称")
    private String labelsName;

    @ApiModelProperty(value = "创建时间")
    private Date labelsCreateTime;

    @ApiModelProperty(value = "是否删除（1已删除；0未删除）")
    private Integer labelsDeleted;


}
