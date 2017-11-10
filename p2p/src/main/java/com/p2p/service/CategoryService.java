package com.p2p.service;


import com.p2p.beans.Category;

import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */
public interface CategoryService {
    //查找类型
    public List<Category> findAllCategory();

    //添加类型
    public int addCategory(Category category);

    //删除某父节点以及其子节点
    public int delCategoryByFid(int cateid);

    //删除某父节点下的某个子节点
    public int delCategoryByChildrenID(int cateid);

    //复选删除类型
    public int delCategoryByIds(List<Category> list);

    String findAllCategoryForCommodity();
}
