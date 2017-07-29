package com.zhongweixian.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhongweixian.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by caoliang on 2017/7/24.
 */

@RestController
@RequestMapping
public class IndexController {


    @Reference(version = "1.0.0")
    private UserService userService;

    @ResponseBody
    @RequestMapping("index")
    public ResponseEntity index(){

        String username = "caoliang";
        userService.sendMessage("zhongweixian" , username , new Date().toString());


        return new ResponseEntity(userService.getMessage(username), HttpStatus.OK);
    }
}
