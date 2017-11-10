package com.p2p.dao;

import com.p2p.beans.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/10/24.
 */
@Repository
@Mapper
public interface CommodityDao {
    public int addCommodity(Commodity commodity);

    public List<Commodity> findAllCommodity();

    public Commodity findAllCommodityBySku(String sku);
}
