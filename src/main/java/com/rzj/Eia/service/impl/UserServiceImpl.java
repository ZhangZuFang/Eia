package com.rzj.Eia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rzj.Eia.entity.User;
import com.rzj.Eia.mapper.UserMapper;
import com.rzj.Eia.service.IUserService;
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
