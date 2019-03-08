package com.fangchen.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QucikController {
    @RequestMapping("/quick")
    @ResponseBody //返回值是json
    public String quick(){
        return "爸爸在此  springboot";
    }
}
