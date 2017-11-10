package com.p2p.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/10.
 */
public class ProductAccount implements Serializable {
    //主键
    private int pId;
    //产品id
    private int pProductId;
    //用户id
    private int pUid;
    //投资编号
    private String pSerialNo;
    //加入日期
    private long pBeginDate;
    //到期日期
    private long pEndDate;
    //赎回日期
    private long pRedeemDate;
    //匹配日期
    private long pMatchDate;
    //金额
    private double pAmount;
    //系统时间
    private long pDate;
    //产品类型
    private String pProductType;
    //收益率类型
    private String pEarningsType;
    //收益率
    private double pEarnings;
    //提前赎回利率
    private double pAdvanceRedemption;
    //选择期限
    private int pDeadline;
    //当前期（账户资金日志表）
    private int aCurrentPeriod;
    //预期收益
    private double pProspectiveEarnings;
    //预期年化收益
    private double pExpectedAnnualIncome;
    //每月盈取利息
    private double pMonthInterest;
    //每月提取利息
    private double pMonthlyExtractInterest;
    //开始计息时间
    private long pInterestStartDate;
    //结束计息时间
    private long pInterestEndDate;
    //收益是否完成
    private int pEarningsIsFinished;
    //可用余额
    private double pAvailableBalance;
    //冻结金额
    private double pFrozenMoney;
    //每月回款日
    private int pSystemPaymentDate;
    //当前期（用户购买产品记录表）
    private String pCurrentMonth;
    //扣去利息
    private double pDeductInterest;
    //未投资金额
    private double pNotInvestMoney;
    //状态
    private int pStatus;
    //到期应回总本息
    private double pEndInvestTotalMoney;
    //当前期实回总本息
    private double pCurrentRealTotalMoney;
    //统计
    private int pDeadlineCount;
    //产品名称
    private String pProductName;
    //月存
    private double pMonthlyDeposit;
    //月存笔数
    private int pMonthlyDepositCount;
    //月乘
    private double pTakeMonth;
    //月乘笔数
    private int pTakeMonthCount;
    //月取
    private double pMayTake;
    //月取笔数
    private int pMayTakeCount;
    //总天数
    private int pTotalAsDay;
    //投资天数
    private int pDeadlineAsDay;
    //
    private int pDays;
    // 投资期限
    private String pDeadlines;
    //投资用户名
    private String username;
    //已赚取利息
    private double pEarnedInterest;
    //备注
    private String pRemark;
    //SUM(可用余额+冻结金额)
    private double sumAvailableBalanceAndFrozenMoney;
    //总计
    private double pTotal;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getpProductId() {
        return pProductId;
    }

    public void setpProductId(int pProductId) {
        this.pProductId = pProductId;
    }

    public int getpUid() {
        return pUid;
    }

    public void setpUid(int pUid) {
        this.pUid = pUid;
    }

    public String getpSerialNo() {
        return pSerialNo;
    }

    public void setpSerialNo(String pSerialNo) {
        this.pSerialNo = pSerialNo;
    }

    public long getpBeginDate() {
        return pBeginDate;
    }

    public void setpBeginDate(long pBeginDate) {
        this.pBeginDate = pBeginDate;
    }

    public long getpEndDate() {
        return pEndDate;
    }

    public void setpEndDate(long pEndDate) {
        this.pEndDate = pEndDate;
    }

    public long getpRedeemDate() {
        return pRedeemDate;
    }

    public void setpRedeemDate(long pRedeemDate) {
        this.pRedeemDate = pRedeemDate;
    }

    public long getpMatchDate() {
        return pMatchDate;
    }

    public void setpMatchDate(long pMatchDate) {
        this.pMatchDate = pMatchDate;
    }

    public double getpAmount() {
        return pAmount;
    }

    public void setpAmount(double pAmount) {
        this.pAmount = pAmount;
    }

    public long getpDate() {
        return pDate;
    }

    public void setpDate(long pDate) {
        this.pDate = pDate;
    }

    public String getpProductType() {
        return pProductType;
    }

    public void setpProductType(String pProductType) {
        this.pProductType = pProductType;
    }

    public String getpEarningsType() {
        return pEarningsType;
    }

    public void setpEarningsType(String pEarningsType) {
        this.pEarningsType = pEarningsType;
    }

    public double getpEarnings() {
        return pEarnings;
    }

    public void setpEarnings(double pEarnings) {
        this.pEarnings = pEarnings;
    }

    public double getpAdvanceRedemption() {
        return pAdvanceRedemption;
    }

    public void setpAdvanceRedemption(double pAdvanceRedemption) {
        this.pAdvanceRedemption = pAdvanceRedemption;
    }

    public int getpDeadline() {
        return pDeadline;
    }

    public void setpDeadline(int pDeadline) {
        this.pDeadline = pDeadline;
    }

    public int getaCurrentPeriod() {
        return aCurrentPeriod;
    }

    public void setaCurrentPeriod(int aCurrentPeriod) {
        this.aCurrentPeriod = aCurrentPeriod;
    }

    public double getpProspectiveEarnings() {
        return pProspectiveEarnings;
    }

    public void setpProspectiveEarnings(double pProspectiveEarnings) {
        this.pProspectiveEarnings = pProspectiveEarnings;
    }

    public double getpExpectedAnnualIncome() {
        return pExpectedAnnualIncome;
    }

    public void setpExpectedAnnualIncome(double pExpectedAnnualIncome) {
        this.pExpectedAnnualIncome = pExpectedAnnualIncome;
    }

    public double getpMonthInterest() {
        return pMonthInterest;
    }

    public void setpMonthInterest(double pMonthInterest) {
        this.pMonthInterest = pMonthInterest;
    }

    public double getpMonthlyExtractInterest() {
        return pMonthlyExtractInterest;
    }

    public void setpMonthlyExtractInterest(double pMonthlyExtractInterest) {
        this.pMonthlyExtractInterest = pMonthlyExtractInterest;
    }

    public long getpInterestStartDate() {
        return pInterestStartDate;
    }

    public void setpInterestStartDate(long pInterestStartDate) {
        this.pInterestStartDate = pInterestStartDate;
    }

    public long getpInterestEndDate() {
        return pInterestEndDate;
    }

    public void setpInterestEndDate(long pInterestEndDate) {
        this.pInterestEndDate = pInterestEndDate;
    }

    public int getpEarningsIsFinished() {
        return pEarningsIsFinished;
    }

    public void setpEarningsIsFinished(int pEarningsIsFinished) {
        this.pEarningsIsFinished = pEarningsIsFinished;
    }

    public double getpAvailableBalance() {
        return pAvailableBalance;
    }

    public void setpAvailableBalance(double pAvailableBalance) {
        this.pAvailableBalance = pAvailableBalance;
    }

    public double getpFrozenMoney() {
        return pFrozenMoney;
    }

    public void setpFrozenMoney(double pFrozenMoney) {
        this.pFrozenMoney = pFrozenMoney;
    }

    public int getpSystemPaymentDate() {
        return pSystemPaymentDate;
    }

    public void setpSystemPaymentDate(int pSystemPaymentDate) {
        this.pSystemPaymentDate = pSystemPaymentDate;
    }

    public String getpCurrentMonth() {
        return pCurrentMonth;
    }

    public void setpCurrentMonth(String pCurrentMonth) {
        this.pCurrentMonth = pCurrentMonth;
    }

    public double getpDeductInterest() {
        return pDeductInterest;
    }

    public void setpDeductInterest(double pDeductInterest) {
        this.pDeductInterest = pDeductInterest;
    }

    public double getpNotInvestMoney() {
        return pNotInvestMoney;
    }

    public void setpNotInvestMoney(double pNotInvestMoney) {
        this.pNotInvestMoney = pNotInvestMoney;
    }

    public int getpStatus() {
        return pStatus;
    }

    public void setpStatus(int pStatus) {
        this.pStatus = pStatus;
    }

    public double getpEndInvestTotalMoney() {
        return pEndInvestTotalMoney;
    }

    public void setpEndInvestTotalMoney(double pEndInvestTotalMoney) {
        this.pEndInvestTotalMoney = pEndInvestTotalMoney;
    }

    public double getpCurrentRealTotalMoney() {
        return pCurrentRealTotalMoney;
    }

    public void setpCurrentRealTotalMoney(double pCurrentRealTotalMoney) {
        this.pCurrentRealTotalMoney = pCurrentRealTotalMoney;
    }

    public int getpDeadlineCount() {
        return pDeadlineCount;
    }

    public void setpDeadlineCount(int pDeadlineCount) {
        this.pDeadlineCount = pDeadlineCount;
    }

    public String getpProductName() {
        return pProductName;
    }

    public void setpProductName(String pProductName) {
        this.pProductName = pProductName;
    }

    public double getpMonthlyDeposit() {
        return pMonthlyDeposit;
    }

    public void setpMonthlyDeposit(double pMonthlyDeposit) {
        this.pMonthlyDeposit = pMonthlyDeposit;
    }

    public int getpMonthlyDepositCount() {
        return pMonthlyDepositCount;
    }

    public void setpMonthlyDepositCount(int pMonthlyDepositCount) {
        this.pMonthlyDepositCount = pMonthlyDepositCount;
    }

    public double getpTakeMonth() {
        return pTakeMonth;
    }

    public void setpTakeMonth(double pTakeMonth) {
        this.pTakeMonth = pTakeMonth;
    }

    public int getpTakeMonthCount() {
        return pTakeMonthCount;
    }

    public void setpTakeMonthCount(int pTakeMonthCount) {
        this.pTakeMonthCount = pTakeMonthCount;
    }

    public double getpMayTake() {
        return pMayTake;
    }

    public void setpMayTake(double pMayTake) {
        this.pMayTake = pMayTake;
    }

    public int getpMayTakeCount() {
        return pMayTakeCount;
    }

    public void setpMayTakeCount(int pMayTakeCount) {
        this.pMayTakeCount = pMayTakeCount;
    }

    public int getpTotalAsDay() {
        return pTotalAsDay;
    }

    public void setpTotalAsDay(int pTotalAsDay) {
        this.pTotalAsDay = pTotalAsDay;
    }

    public int getpDeadlineAsDay() {
        return pDeadlineAsDay;
    }

    public void setpDeadlineAsDay(int pDeadlineAsDay) {
        this.pDeadlineAsDay = pDeadlineAsDay;
    }

    public int getpDays() {
        return pDays;
    }

    public void setpDays(int pDays) {
        this.pDays = pDays;
    }

    public String getpDeadlines() {
        return pDeadlines;
    }

    public void setpDeadlines(String pDeadlines) {
        this.pDeadlines = pDeadlines;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getpEarnedInterest() {
        return pEarnedInterest;
    }

    public void setpEarnedInterest(double pEarnedInterest) {
        this.pEarnedInterest = pEarnedInterest;
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark;
    }

    public double getSumAvailableBalanceAndFrozenMoney() {
        return sumAvailableBalanceAndFrozenMoney;
    }

    public void setSumAvailableBalanceAndFrozenMoney(double sumAvailableBalanceAndFrozenMoney) {
        this.sumAvailableBalanceAndFrozenMoney = sumAvailableBalanceAndFrozenMoney;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }
}
