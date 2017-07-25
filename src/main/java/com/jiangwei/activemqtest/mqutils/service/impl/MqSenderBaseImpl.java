package com.jiangwei.activemqtest.mqutils.service.impl;

import com.jiangwei.activemqtest.Messages.MqMessage;
import com.jiangwei.activemqtest.mqutils.service.MqSender;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTempDestination;

import javax.jms.*;

/**
 *  Created by weijiang on 2017/7/25
 *  active mq api接口调用 编程 消息发送者
 */
public class MqSenderBaseImpl implements MqSender {

    private String userName;
    private String passWord;
    private String brokerUrl;
    private String queueName;
    private Session session;
    private MessageProducer messageProducer;
    private Destination destination;




    /**
     * 初始化方法
     */
    public void init() throws Exception {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(userName, passWord, brokerUrl);
        Connection connection = connectionFactory.createConnection();
        session = connection.createSession(true, Session.CLIENT_ACKNOWLEDGE);
        destination = new ActiveMQQueue(queueName);
        messageProducer = session.createProducer(destination);
    }

    public void sendMessage(MqMessage message) throws Exception{
        messageProducer.send(session.createObjectMessage(message));
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
}
