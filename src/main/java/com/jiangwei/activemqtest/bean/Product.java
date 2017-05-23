package com.jiangwei.activemqtest.bean;

import java.io.Serializable;

/**
 * Created by weijiang
 * Date: 2017/5/23
 * Desc:
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 2803103853645147136L;

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
