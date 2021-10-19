package org.nari.controller;

import org.nari.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    UserService userService;

}
