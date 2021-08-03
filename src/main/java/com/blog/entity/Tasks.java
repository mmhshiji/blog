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
@ApiModel(value="Tasks对象", description="")
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "任务id")
      @TableId(value = "tasks_id", type = IdType.ID_WORKER)
    private Long tasksId;

    @ApiModelProperty(value = "任务名称")
    private String tasksName;

    @ApiModelProperty(value = "任务状态  0：正常  1：暂停")
    private Integer tasksStatus;

    @ApiModelProperty(value = "备注")
    private String tasksRemark;

    @ApiModelProperty(value = "创建时间")
    private Date tasksCreateTime;


}
