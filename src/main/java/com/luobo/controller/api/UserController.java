package com.luobo.controller.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luobo.entity.Message;
import com.luobo.entity.User;
import com.luobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("apiUserController")
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public Message list(@RequestParam(defaultValue = "1") Integer pageNum,
                        @RequestParam(defaultValue = "5")   Integer pageSize,
                        ModelMap modelMap) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userService.findAll();
        PageInfo pageInfo = new PageInfo(userList,5);
        return Message.success().add("pageInfo",pageInfo);
    }

}
