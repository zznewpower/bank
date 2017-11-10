package com.p2p.service;

import com.p2p.beans.Res;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
public interface ResService {
    public List<Res> findRes();
    public int saveRoleResource(Map<String, Object> map);
    public int delRoleResource(int rid);
    public List<Res> findRoleRes(int uid);
}
