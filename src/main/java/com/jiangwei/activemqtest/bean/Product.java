package com.jiangwei.activemqtest.bean;

import com.jiangwei.activemqtest.Messages.MqMessage;

import java.io.Serializable;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc:
 */
public class Product implements MqMessage {

    private static final long serialVersionUID = -5518732483154270863L;

    private String productName;

    private Double price;

    private String produceFactory;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduceFactory() {
        return produceFactory;
    }

    public void setProduceFactory(String produceFactory) {
        this.produceFactory = produceFactory;
    }
}
