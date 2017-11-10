package com.p2p.dao;

import com.p2p.beans.DebtInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017.11.09 0009.
 */
@Repository
@Mapper
public interface DebtInfoDao {
    //查找所有债权信息
    public DebtInfo selectAllDebt();
}
