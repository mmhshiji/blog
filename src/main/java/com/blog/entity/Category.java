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
@ApiModel(value="Category对象", description="")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类ID")
      @TableId(value = "category_id", type = IdType.ID_WORKER)
    private Integer categoryId;

    @ApiModelProperty(value = "分类名称")
    private String categoryName;

    @ApiModelProperty(value = "创建时间")
    private Date categoryCreateTime;

    @ApiModelProperty(value = "更新时间")
    private Date categoryUpdateTime;

    @ApiModelProperty(value = "是否删除（1已删除；0未删除）")
    private Integer categoryDeleted;

    @ApiModelProperty(value = "父分类ID")
    private Long parentCategoryId;


}
