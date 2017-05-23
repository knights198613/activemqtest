package com.jiangwei.activemqtest.mqutils;

import com.jiangwei.activemqtest.mqutils.service.MqReciver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc: mqΩ” ‹∂À≤‚ ‘
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring_cfg.xml")
public class MqReciverTest {
    @Autowired
    MqReciver mqReciver;


    @Test
    public void testReciveMessage() {
        try {
            Thread.sleep(100000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
