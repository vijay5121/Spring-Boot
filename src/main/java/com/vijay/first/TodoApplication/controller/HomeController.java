package com.vijay.first.TodoApplication.controller;

import com.vijay.first.TodoApplication.config.privateconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@RestController
public class HomeController {
    @Value("${vijay.profile.image.path}")
    private String profilepath;

    @Autowired
    private privateconfig privateconfig;

    @RequestMapping("/todos")
    public List<String> justTest(){

        List<String> todos= Arrays.asList("core java","spring boot","php","django");
        return todos;
    }
    @RequestMapping("/profile")
    public String getProfilepath(){
        return this.profilepath;
    }
@RequestMapping("/configrrr")
    public privateconfig getPrivateconfig(){
        System.out.println(this.privateconfig);
        return this.privateconfig;
    }

}
