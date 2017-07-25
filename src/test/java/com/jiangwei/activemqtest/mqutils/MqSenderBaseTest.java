package com.jiangwei.activemqtest.mqutils;

import com.jiangwei.activemqtest.bean.Product;
import com.jiangwei.activemqtest.mqutils.service.impl.MqSenderBaseImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by weijiang
 * Date: 2017/7/25
 * Desc: ActiveMq 消息发送端测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_cfg.xml"})
public class MqSenderBaseTest {
    @Autowired
    private MqSenderBaseImpl mqSenderBase;

    @Test
    public void testSendMessage() {
        Product product = new Product();
        product.setPrice(11.2);
        product.setProductName("桃子");
        product.setProduceFactory("桃子工厂");
        try {
            mqSenderBase.sendMessage(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
