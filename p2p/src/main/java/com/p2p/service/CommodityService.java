package com.p2p.service;

import com.p2p.beans.Commodity;

import java.util.List;

/**
 * Created by Administrator on 2017/10/24.
 */
public interface CommodityService {
    public int addCommodity(Commodity commodity);

    public List<Commodity> findAllCommodity();
    public void createHTML(String sku);
}
