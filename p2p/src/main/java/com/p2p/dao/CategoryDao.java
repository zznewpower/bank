package com.p2p.dao;

import com.p2p.beans.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */
@Repository
@Mapper
public interface CategoryDao {


    public List<Category> findAllCategory();

    @CacheEvict(value = "category",allEntries = true,key = "findAllCategory")
    public int addCategory(Category category);

    //删除父节点id为cateid的所有子节点以及本身
    @CacheEvict(value = "category",allEntries = true)
    public int delCategoryByFid(int cateid);

    //删除某父节点下的某一子节点
    @CacheEvict(value = "category",allEntries = true)
    public int delCategoryByChildrenID(int cateid);

    //复选删除
    @CacheEvict(value = "category",allEntries = true)
    public int delCategoryByIds(List<Category> list);

}
