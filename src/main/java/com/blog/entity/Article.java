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
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章ID")
      @TableId(value = "article_id", type = IdType.ID_WORKER)
    private Integer articleId;

    @ApiModelProperty(value = "文章标题")
    private String articleTitle;

    @ApiModelProperty(value = "文章内容")
    private String articleContent;

    @ApiModelProperty(value = "创建时间")
    private Date articleCreateTime;

    @ApiModelProperty(value = "修改时间")
    private Date articleUpdateTime;

    @ApiModelProperty(value = "文章浏览次数")
    private Integer articleClick;

    @ApiModelProperty(value = "文章回复数量")
    private Integer articleComment;

    @ApiModelProperty(value = "文章点赞数量")
    private Integer articlePraise;

    @ApiModelProperty(value = "文章最后回复时间")
    private Date articleCommentDate;

    @ApiModelProperty(value = "是否删除（1已删除；0未删除）")
    private Integer articleDeleted;

    @ApiModelProperty(value = "文章所属用户")
    private Integer arcticleUserId;

    @ApiModelProperty(value = "文章所属分类")
    private Integer articleCategoryId;


}
