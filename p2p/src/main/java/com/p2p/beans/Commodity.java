package com.p2p.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/24.
 */
public class Commodity implements Serializable{
    private String sku;
    private String comname;
    private float price;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }



    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "sku='" + sku + '\'' +
                ", comname='" + comname + '\'' +
                ", price=" + price +
                '}';
    }
}
