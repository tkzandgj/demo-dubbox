package com.zhongweixian.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhongweixian.entity.Message;
import com.zhongweixian.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by caoliang on 2017/7/29.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    Map<String , List<Message>> data = new HashMap();

    @Override
    public void sendMessage(String from, String to, String body) {
        List<Message> messageList = data.get(to);
        if(messageList==null) messageList = new ArrayList<>();
        Message message = new Message();
        message.setBody(body);
        message.setFrom(from);
        message.setTo(to);
        message.setCts(new Date());
        messageList.add(message);
        data.put(to,messageList);
        logger.info("user : {} send message : {} to: {}" , from , to , body);
    }

    @Override
    public List<Message> getMessage(String username) {
        logger.info("user {} get message" , username);
        return data.get(username);
    }

    @Override
    public List<Message> getMessage(String username, Long level) {
        return data.get(username);
    }
}
