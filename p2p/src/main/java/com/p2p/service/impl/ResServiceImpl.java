package com.p2p.service.impl;

import com.p2p.beans.Res;
import com.p2p.dao.ResDao;
import com.p2p.service.ResService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@Service

public class ResServiceImpl implements ResService {
    @Resource
    private ResDao resDao;

    public List<Res> findRes() {
        return resDao.findAllRes();
    }

    @Override
    public int saveRoleResource(Map<String,Object> map) {
        return resDao.saveRoleResource(map);
    }

    @Override
    public List<Res> findRoleRes(int uid) {
        return resDao.findRoleRes(uid);
    }

    public int delRoleResource(int rid) {
        return resDao.delRoleResource(rid);
    }
}

