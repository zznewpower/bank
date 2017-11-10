package com.p2p.service.impl;


import com.alibaba.fastjson.JSON;
import com.p2p.beans.Category;
import com.p2p.dao.CategoryDao;
import com.p2p.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by Administrator on 2017/10/20.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryDao categoryDao;
    @Override
    public List<Category> findAllCategory() {
        return categoryDao.findAllCategory();
    }


    @Override
    //删除某父节点下的某子节点
    public int delCategoryByChildrenID(int cateid) {
        return categoryDao.delCategoryByChildrenID(cateid);
    }

    @Override
    //删除父节点id 为cateid下的所有子节点以及本身
    public int delCategoryByFid(int cateid) {
        return categoryDao.delCategoryByFid(cateid);
    }

    @Override
    public int addCategory(Category category) {
        return categoryDao.addCategory(category);
    }

    @Override
    //复选删除类型
    public int delCategoryByIds(List<Category> list) {
        return categoryDao.delCategoryByIds(list);
    }

    @Override
    public String findAllCategoryForCommodity() {
        List<Category> categories = categoryDao.findAllCategory();
        List<Category> ls = new LinkedList<>();
        List<Category> lc = new LinkedList<>();
        ls.addAll(categories);
        for(Category category:categories){
            if(category.getPid()==0){
                lc.add(category);
                for(Category ca : categories){
                    if(ca.getPid()==category.getCateid()){
                        category.getChiledren().add(ca);
                        for(Category cc:categories){
                            if(cc.getPid()==ca.getCateid()){
                                ca.getChiledren().add(cc);
                            }
                        }
                    }

                }
            }

        }
        String json = JSON.toJSONString(lc);
        String s1="^([\"children\":\\[\\],])$";
        System.out.println(s1);
        String all = json.replaceAll(s1, "");
        return all;
    }
}
