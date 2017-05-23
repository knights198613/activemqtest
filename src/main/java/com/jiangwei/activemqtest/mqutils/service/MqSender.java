package com.jiangwei.activemqtest.mqutils.service;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc: 消息发送方
 */
public interface MqSender {

    /**
     * 发送消息的方法
     * @param message
     */
    public void sendMessage(Object message);
}
