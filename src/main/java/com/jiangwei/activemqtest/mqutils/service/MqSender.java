package com.jiangwei.activemqtest.mqutils.service;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc: ��Ϣ���ͷ�
 */
public interface MqSender {

    /**
     * ������Ϣ�ķ���
     * @param message
     */
    public void sendMessage(Object message);
}
