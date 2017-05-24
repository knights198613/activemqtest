package com.jiangwei.activemqtest.mqutils.service.impl;

import com.alibaba.fastjson.JSON;
import com.jiangwei.activemqtest.mqutils.service.MqReciver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc:
 */
@Component("mqReciver")
public class MqReciverImpl implements MqReciver, MessageListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(MqReciverImpl.class);

    public void onMessage(Message message) {
        if(message instanceof ObjectMessage) {
            try {
                Object result = ((ObjectMessage) message).getObject();
                System.out.println(JSON.toJSON(result));
            } catch (JMSException e) {
                LOGGER.error("mq recive message has error, error:{}", e);
            }
        }
        throw new RuntimeException("发生错误");
    }
}
