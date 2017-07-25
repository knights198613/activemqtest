package com.jiangwei.activemqtest.mqutils.service;

import com.jiangwei.activemqtest.Messages.MqMessage;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc: 发送消息接口
 */
public interface MqSender {

    /**
     * 发送消息方法
     * @param message
     */
    public void sendMessage(MqMessage message) throws Exception ;
}
