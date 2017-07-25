package com.jiangwei.activemqtest.mqutils;

import com.alibaba.fastjson.JSON;
import com.jiangwei.activemqtest.bean.Product;
import com.jiangwei.activemqtest.mqutils.service.MqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc: mq���Ͷ˲�����
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring_cfg.xml")
public class MqSenderTest {
    @Autowired
    MqSender mqSender;

    @Test
    public void testSendMessage() {
        Product product = new Product();
        product.setPrice(11.11);
        product.setProductName("apple");
        product.setProduceFactory("beijingCountry");

        try {
            mqSender.sendMessage(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
