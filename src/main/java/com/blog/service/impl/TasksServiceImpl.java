package com.blog.service.impl;

import com.blog.entity.Tasks;
import com.blog.mapper.TasksMapper;
import com.blog.service.TasksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2021-08-03
 */
@Service
public class TasksServiceImpl extends ServiceImpl<TasksMapper, Tasks> implements TasksService {

}
