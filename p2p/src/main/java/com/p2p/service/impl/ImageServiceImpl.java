package com.p2p.service.impl;

import com.p2p.beans.Image;
import com.p2p.dao.ImageDao;
import com.p2p.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/24.
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageDao imageDao;
    @Override
    public int ImageAdd(Image image) {
        return imageDao.ImageAdd(image);
    }
}
