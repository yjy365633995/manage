package org.nari.controller;

import org.nari.service.UserService;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

}
