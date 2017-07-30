package com.zhongweixian.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhongweixian.entity.ChatType;
import com.zhongweixian.entity.MessagesReqBody;
import com.zhongweixian.entity.MessagesType;
import com.zhongweixian.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Reference(version = "1.0.0")
    private UserService userService;

    @ResponseBody
    @RequestMapping("index")
    public ResponseEntity index(){

        Integer uid = 111;

        MessagesReqBody messagesReqBody = MessagesReqBody.newBuilder().
                setChatType(ChatType.CHAT_TYPE_PRIVATE).
                setFromId(2222).
                setToId(uid).
                setText(new Date().toString()).
                setMessagesType(MessagesType.TEXT).build();
        logger.info("send from : {} " , messagesReqBody);
        userService.sendMessage(messagesReqBody);


        return new ResponseEntity(userService.getMessage(uid), HttpStatus.OK);
    }
}
