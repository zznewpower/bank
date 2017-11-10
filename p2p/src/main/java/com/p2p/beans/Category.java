package com.p2p.beans;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */
public class Category implements Serializable {
    @JSONField(name = "id")
    private int cateid;
    @JSONField(name = "text")
    private String categoryname;
    private int pid;
    private List<Category> chiledren=new LinkedList<>();

    public List<Category> getChiledren() {
        return chiledren;
    }

    public void setChiledren(List<Category> chiledren) {
        this.chiledren = chiledren;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Category(int cateid, int pid) {
        this.cateid = cateid;
        this.pid = pid;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "cateid=" + cateid +
                ", categoryname='" + categoryname + '\'' +
                ", pid=" + pid +
                '}';
    }
}
