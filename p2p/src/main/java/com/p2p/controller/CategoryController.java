package com.p2p.controller;

import com.p2p.beans.Category;
import com.p2p.service.CategoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/20.
 */
@RestController
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    //首页显示的树
    @RequestMapping("findAllCategory")
    public List<Category> findAllCategory(){
        return categoryService.findAllCategory();
    }

    //添加商品需要的树
    @RequestMapping("findAllCategoryForCommodity")
    public String findAllCategoryForCommodity(){
        System.out.println(categoryService.findAllCategoryForCommodity());
        return categoryService.findAllCategoryForCommodity();
    }

    //存储类型
    @RequestMapping("saveCategory")
    public int addCategory(Category category){
        return categoryService.addCategory(category);
    }

    @RequestMapping("delCategoryById")
    //只适用于不能复选
    public int delCategoryById(Category category){
        int pid = category.getPid();
        //判断用户选中的是父节点还是子节点
        if (pid==0){
            //如果选择的是父节点则删除父节点下所有子节点以及父节点本身
           return categoryService.delCategoryByFid(category.getCateid());
        }else {
            //如果选择的是子节点则删除该字节点
            return  categoryService.delCategoryByChildrenID(category.getCateid());
        }
    }

    @RequestMapping("delCategoryByIds")
    //只适用于不能复选
    public int delCategoryByIds(@RequestBody Map<String,ArrayList<Integer>> map){

        List<Integer> pids=map.get("pids");
        List<Integer> cateids = map.get("cateids");
        List<Category> list = new ArrayList<>();
        for (int i=0;i<pids.size();i++){
            list.add(new Category(cateids.get(i),pids.get(i)));
        }
        return categoryService.delCategoryByIds(list);
    }
}
