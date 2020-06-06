package com.rzj.Eia.service.impl;

import com.rzj.Application.entity.User;
import com.rzj.Application.mapper.UserMapper;
import com.rzj.Application.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author authorName
 * @since 2020-06-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
