package com.jiangwei.activemqtest.mqutils.service.impl;

import com.alibaba.fastjson.JSON;
import com.jiangwei.activemqtest.Messages.MqMessage;
import com.jiangwei.activemqtest.mqutils.service.MqSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc:
 */
@Component("mqSender")
public class MqSenderImpl implements MqSender{
    private static final Logger LOGGER = LoggerFactory.getLogger(MqSenderImpl.class);

    @Autowired
    private JmsTemplate myJMStemplate;


    public void sendMessage(MqMessage message) {
        try {
            myJMStemplate.convertAndSend(message);
        } catch (JmsException e) {
            LOGGER.error("mq send message has error, message:{}, error:{}", JSON.toJSON(message), e);
        }
    }


}
