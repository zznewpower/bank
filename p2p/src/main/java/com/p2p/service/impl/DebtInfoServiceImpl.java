package com.p2p.service.impl;

import com.p2p.beans.DebtInfo;
import com.p2p.dao.DebtInfoDao;
import com.p2p.service.DebtInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017.11.09 0009.
 */
@Service
public class DebtInfoServiceImpl implements DebtInfoService{
    @Resource
    private DebtInfoDao debtInfoDao;
    @Override
    public DebtInfo selectAllDebt() {
        return debtInfoDao.selectAllDebt();
    }
}
