package com.zhongweixian.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhongweixian.entity.MessagesReqBody;
import com.zhongweixian.entity.MessagesRespBody;
import com.zhongweixian.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by caoliang on 2017/7/29.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    Map<Integer , List<MessagesRespBody>> data = new HashMap();

    @Override
    public void sendMessage(MessagesReqBody messagesReqBody) {
        List<MessagesRespBody> messageList = data.get(messagesReqBody.getToId());
        if(messageList==null) messageList = new ArrayList<>();
        MessagesRespBody messagesRespBody = MessagesRespBody.newBuilder().
                setMessagesType(messagesReqBody.getMessagesType()).
                setFromId(messagesReqBody.getToId()).
                setToId(messagesReqBody.getFromId()).
                setText(messagesReqBody.getText()).
                setTime(Instant.now().toEpochMilli()).
                build();
        messageList.add(messagesRespBody);
        logger.info("messagesReqBody : {}" , messagesReqBody);
        data.put(messagesReqBody.getToId(),messageList);
    }

    @Override
    public List<MessagesRespBody> getMessage(Integer uid) {
        logger.info("user {} get message" , uid);
        return data.get(uid);
    }

    @Override
    public List<MessagesRespBody> getMessage(Integer uid, Long level) {
        return data.get(uid);
    }
}
