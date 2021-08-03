package com.blog.entity;

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
 * @author 
 * @since 2021-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Files对象", description="")
public class Files implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文件id")
      @TableId(value = "files_id", type = IdType.ID_WORKER)
    private Long filesId;

    @ApiModelProperty(value = "文件URL地址")
    private String filesUrl;

    @ApiModelProperty(value = "创建时间")
    private String filesCreateTime;

    @ApiModelProperty(value = "文件名称")
    private String filesName;

    @ApiModelProperty(value = "文件路径")
    private String filesPath;

    @ApiModelProperty(value = "是否删除（1已删除；0未删除）")
    private Integer filesDeleted;


}
