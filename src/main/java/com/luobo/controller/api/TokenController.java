package com.luobo.controller.api;

import com.luobo.entity.Message;
import com.luobo.entity.Token;
import com.luobo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("apiTokenController")
@RequestMapping("/api/token")
public class TokenController {
    @Autowired
    private TokenService tokenService;

    @RequestMapping("/list")
    @ResponseBody
    public Message list() {
        List<Token> list = tokenService.findAll();

        return Message.success().add("tokenList",list);
    }
}
