package com.p2p.dao;

import com.p2p.beans.Image;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/10/24.
 */
@Repository
@Mapper
public interface ImageDao {
    public int ImageAdd(Image image);
}
