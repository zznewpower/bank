package com.p2p.controller;


import com.p2p.beans.Commodity;
import com.p2p.beans.Image;
import com.p2p.service.CommodityService;
import com.p2p.service.ImageService;
import com.p2p.until.CountUtil;
import com.p2p.until.ThreadUtil;
import com.p2p.until.UUIDStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * Created by Administrator on 2017/10/24.
 */
@RestController
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
    @Autowired
    private ImageService imageService;
    @RequestMapping("addCommodity")
    @Transactional
    public int addCommodity(Commodity commodity, @RequestParam("file")MultipartFile file){
        String s = file.getOriginalFilename();
        String uuid = UUIDStringUtil.getUUID(s);
        String path="D:/image/"+s;
        ThreadUtil.svaFile(new Runnable() {
            @Override
            public void run() {

                File f = new File(path);
                try {
                    file.transferTo(f);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        commodity.setSku(uuid);
        Image image = new Image();
        image.setCommsku(uuid);
        String uuid1 = UUIDStringUtil.getUUID("");
        image.setImagid(uuid1);
        image.setUrl(path);
        imageService.ImageAdd(image);
        return commodityService.addCommodity(commodity);
    }

    @RequestMapping("findAllCommodity")
    public List<Commodity> findAllCommodity(){

        return commodityService.findAllCommodity();
    }

    @RequestMapping("shangjia")
    public String createHTML(String sku){
        commodityService.createHTML(sku);
        return CountUtil.RESULT_OK;
    }
}
