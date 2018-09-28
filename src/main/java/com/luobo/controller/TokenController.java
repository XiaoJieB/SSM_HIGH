package com.luobo.controller;

import com.luobo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("tokenController")
public class TokenController {
    @Autowired
    private TokenService tokenService;

}
