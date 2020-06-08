package com.rzj.Eia.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rzj.Eia.entity.User;
import com.rzj.Eia.mapper.UserMapper;
import com.rzj.Eia.service.IUserService;
import com.rzj.Eia.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author authorName
 * @since 2020-06-05
 */
@RestController
@RequestMapping("/Eia")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/loginFirst")
    public @ResponseBody
    String loginFirst(User user) {
        String firstLogin = "fail";
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUsr, user.getUsr()).eq(User::getPwd, user.getPwd());
        List<User> usrs = userService.list(queryWrapper);
        if (usrs.size() > 0) {
            firstLogin = "sucess";
        }
        return firstLogin;

    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public @ResponseBody
    String createUser(@ModelAttribute User user) {
        user.setDelete(false);
        user.setEnable(true);
        if (userService.save(user)) {

        }
        return "sucess";

    }

}

