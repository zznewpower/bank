package com.p2p.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/10/12.
 */
public class Res {
    private int resId;
    private String text;
    private String url;
    private Set<Res> children = new HashSet<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<Res> getChildren() {
        return children;
    }

    public void setChildren(Set<Res> children) {
        this.children = children;
    }
}
