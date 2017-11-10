package com.p2p.controller;

import com.p2p.beans.DebtInfo;
import com.p2p.service.DebtInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017.11.09 0009.
 */
@RestController
@RequestMapping("/api/v1")
public class DebtInfoController {
    @Autowired
    private DebtInfoService debtInfoService;
    @RequestMapping("selectAllDebt")
    public DebtInfo selectAllDebt(){
        return debtInfoService.selectAllDebt();
    }
}
