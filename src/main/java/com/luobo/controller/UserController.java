package com.luobo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luobo.entity.User;
import com.luobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String list(@RequestParam(defaultValue = "1") Integer pageNum,
                    @RequestParam(defaultValue = "5")   Integer pageSize,
                    ModelMap modelMap) {
        PageHelper.startPage(pageNum,pageSize);
        //pageHelper后面紧跟的查询就是分页查询
        List<User> userList = userService.findAll();
        //包含了分页的详细信息,           连续显示的页数
        PageInfo pageInfo = new PageInfo(userList,5);
//        System.out.println("当前页码："+pageInfo.getPageNum());
//        System.out.println("总页码："+pageInfo.getPages());
//        System.out.println("总记录："+pageInfo.getTotal());
        modelMap.addAttribute("pageInfo",pageInfo);
        return "user/list";
    }

}
