package com.p2p.service.impl;

import com.p2p.beans.Commodity;
import com.p2p.dao.CommodityDao;
import com.p2p.service.CommodityService;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import javax.annotation.Resource;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/10/24.
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityDao commodityDao;
    @Resource
    private FreeMarkerConfig config;
    public int addCommodity(Commodity commodity){
        return commodityDao.addCommodity(commodity);
    }

    public List<Commodity> findAllCommodity(){
        return commodityDao.findAllCommodity();
    }

    public void createHTML(String sku){
        try {
            Commodity commodity = commodityDao.findAllCommodityBySku(sku);
            Template template = config.getConfiguration().getTemplate("item.ftl");
            FileWriter writer = new FileWriter("D:/html/" + sku + ".html");
            template.process(commodity,writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
