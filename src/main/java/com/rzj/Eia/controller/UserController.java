package com.rzj.Eia.controller;


import com.rzj.Eia.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author authorName
 * @since 2020-06-05
 */
@RestController
@RequestMapping("/Eia/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    public @ResponseBody
    String loginFirst(@RequestParam("usr") String usr, @RequestParam("pwd") String pwd) {



        return "";

    }


}

