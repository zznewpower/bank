package com.p2p.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/24.
 */
public class Image implements Serializable {
    private String imgid;
    private String url;
    private String commsku;

    public String getImagid() {
        return imgid;
    }

    public void setImagid(String imagid) {
        this.imgid = imagid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCommsku() {
        return commsku;
    }

    public void setCommsku(String commsku) {
        this.commsku = commsku;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imagid='" + imgid + '\'' +
                ", url='" + url + '\'' +
                ", commsku='" + commsku + '\'' +
                '}';
    }
}
