package com.zhongweixian.service;

import com.zhongweixian.entity.MessagesReqBody;
import com.zhongweixian.entity.MessagesRespBody;

import java.util.List;

/**
 * Created by caoliang on 2017/7/24.
 */
public interface UserService {

    void sendMessage(MessagesReqBody messagesReqBody);

    List<MessagesRespBody> getMessage(Integer uid);

    List<MessagesRespBody> getMessage(Integer uid , Long level);


}
