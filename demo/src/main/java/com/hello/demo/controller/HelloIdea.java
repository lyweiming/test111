package com.hello.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WMM
 * @date 2020/07/02
 **/
@RestController
public class HelloIdea {

    @RequestMapping("hello")
    public String Hello(){

        return "hello idea";
    }
}
