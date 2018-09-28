package com.luobo.service;

import com.luobo.dao.TokenMapper;
import com.luobo.entity.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {
    @Autowired
    TokenMapper tokenMapper;


    public List<Token> findAll() {
        List<Token> tokenList = tokenMapper.selectByExample(null);
        return tokenList;
    }
}
