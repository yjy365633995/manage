package org.nari.controller;

import org.nari.vo.Result;
import org.nari.model.User;
import org.nari.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User user0 = userService.getUserInfo(user.getAccount());
        if(null == user0){
            return Result.error("用户不存在");
        }else{
            if(userService.login(user)){
                return Result.success(user0);
            }else{
                return Result.error("密码错误");
            }
        }
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user){
        User user0 = userService.register(user);
        return null == user0? Result.error("注册失败,账号已存在") : Result.success(user0);
    }

    @PostMapping("/modify")
    public Result modify(@RequestBody User user){
        User user0 = userService.modifyUser(user);
        return user0!=null? Result.success(user0):Result.error("更新失败");
    }

    @PostMapping("/modify/password")
    public Result modifyPassword(@RequestBody User user){
        userService.modifyPassword(user);
        return Result.success();
    }



}
