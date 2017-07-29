package com.zhongweixian.service;

import com.zhongweixian.entity.Message;

import java.util.List;

/**
 * Created by caoliang on 2017/7/24.
 */
public interface UserService {

    void sendMessage(String from , String to , String body);

    List<Message> getMessage(String username);

    List<Message> getMessage(String username , Long level);


}
