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
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论ID")
      @TableId(value = "comment_id", type = IdType.ID_WORKER)
    private Integer commentId;

    @ApiModelProperty(value = "评论标题")
    private String commentTitle;

    @ApiModelProperty(value = "评论内容")
    private String commentContent;

    @ApiModelProperty(value = "评论日期")
    private Date commentDate;

    @ApiModelProperty(value = "评论点赞数量")
    private Integer commentPraise;

    @ApiModelProperty(value = "父评论ID")
    private Long parentCommentId;

    @ApiModelProperty(value = "发表评论用户")
    private Integer commentUserId;

    @ApiModelProperty(value = "评论所属文章")
    private Integer commentArticleId;


}
