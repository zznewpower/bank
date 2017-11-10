package com.p2p.beans;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017.11.09 0009.
 */
//债权表
public class DebtInfo implements Serializable{
    private int id; //主键
    private String debtNo;  //债权编号
    private String  contractNo;  //合同编号
    private String debtorsName;  //债务人名称
    private String  debtorsId;    //债务人身份证号
    private String loanPurpose;     //借款用途
    private String loanType;        //原始借款类型
    private long loanStartDate;    //原始借款到期日期
    private long loanPeriod;        //原始借款期限
    private long loanEndDate;       //原始借款到期时间
    private String repaymentStyle;  //还款方式
    private long repaymenDate;     //还款日
    private BigDecimal repaymenMoney;   //还款金额
    private BigDecimal debtMoney;      //债权金额
    private BigDecimal debtYearRate;//债权年利率化
    private BigDecimal debtMonthRate;//债权月利率
    private BigDecimal debtTransferredMoney;//债权转入金额
    private long debtTransferredDate;//债权转入日期
    private long debtTransferredPeriod;//债权转入期限
    private long debtRansferOutDate;//债权转出日期
    private String creditor;//债权人
    private String debtStatus;//债权状态
    private int borrowerId;//借款人ID
    private long availablePeriod;//可用期限
    private BigDecimal availableMoney;//可用金额
    private BigDecimal matchedMoney;//已匹配金额
    private int matchedStatus;//部分匹配11401,  完全匹配11402,   未匹配11403, 正在匹配11404
    private String repaymentStyleName;//还款方式名称
    private String debtStatusName;//债权状态名称
    private String matchedStatusName;//匹配状态名称
    private String debtType;//标的类型
    private String debtTypeName;//标的类型名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDebtNo() {
        return debtNo;
    }

    public void setDebtNo(String debtNo) {
        this.debtNo = debtNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getDebtorsName() {
        return debtorsName;
    }

    public void setDebtorsName(String debtorsName) {
        this.debtorsName = debtorsName;
    }

    public String getDebtorsId() {
        return debtorsId;
    }

    public void setDebtorsId(String debtorsId) {
        this.debtorsId = debtorsId;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public long getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(long loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public long getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(long loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public long getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanEndDate(long loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    public String getRepaymentStyle() {
        return repaymentStyle;
    }

    public void setRepaymentStyle(String repaymentStyle) {
        this.repaymentStyle = repaymentStyle;
    }

    public long getRepaymenDate() {
        return repaymenDate;
    }

    public void setRepaymenDate(long repaymenDate) {
        this.repaymenDate = repaymenDate;
    }

    public BigDecimal getRepaymenMoney() {
        return repaymenMoney;
    }

    public void setRepaymenMoney(BigDecimal repaymenMoney) {
        this.repaymenMoney = repaymenMoney;
    }

    public BigDecimal getDebtMoney() {
        return debtMoney;
    }

    public void setDebtMoney(BigDecimal debtMoney) {
        this.debtMoney = debtMoney;
    }

    public BigDecimal getDebtYearRate() {
        return debtYearRate;
    }

    public void setDebtYearRate(BigDecimal debtYearRate) {
        this.debtYearRate = debtYearRate;
    }

    public BigDecimal getDebtMonthRate() {
        return debtMonthRate;
    }

    public void setDebtMonthRate(BigDecimal debtMonthRate) {
        this.debtMonthRate = debtMonthRate;
    }

    public BigDecimal getDebtTransferredMoney() {
        return debtTransferredMoney;
    }

    public void setDebtTransferredMoney(BigDecimal debtTransferredMoney) {
        this.debtTransferredMoney = debtTransferredMoney;
    }

    public long getDebtTransferredDate() {
        return debtTransferredDate;
    }

    public void setDebtTransferredDate(long debtTransferredDate) {
        this.debtTransferredDate = debtTransferredDate;
    }

    public long getDebtTransferredPeriod() {
        return debtTransferredPeriod;
    }

    public void setDebtTransferredPeriod(long debtTransferredPeriod) {
        this.debtTransferredPeriod = debtTransferredPeriod;
    }

    public long getDebtRansferOutDate() {
        return debtRansferOutDate;
    }

    public void setDebtRansferOutDate(long debtRansferOutDate) {
        this.debtRansferOutDate = debtRansferOutDate;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public String getDebtStatus() {
        return debtStatus;
    }

    public void setDebtStatus(String debtStatus) {
        this.debtStatus = debtStatus;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public long getAvailablePeriod() {
        return availablePeriod;
    }

    public void setAvailablePeriod(long availablePeriod) {
        this.availablePeriod = availablePeriod;
    }

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public BigDecimal getMatchedMoney() {
        return matchedMoney;
    }

    public void setMatchedMoney(BigDecimal matchedMoney) {
        this.matchedMoney = matchedMoney;
    }

    public int getMatchedStatus() {
        return matchedStatus;
    }

    public void setMatchedStatus(int matchedStatus) {
        this.matchedStatus = matchedStatus;
    }

    public String getRepaymentStyleName() {
        return repaymentStyleName;
    }

    public void setRepaymentStyleName(String repaymentStyleName) {
        this.repaymentStyleName = repaymentStyleName;
    }

    public String getDebtStatusName() {
        return debtStatusName;
    }

    public void setDebtStatusName(String debtStatusName) {
        this.debtStatusName = debtStatusName;
    }

    public String getMatchedStatusName() {
        return matchedStatusName;
    }

    public void setMatchedStatusName(String matchedStatusName) {
        this.matchedStatusName = matchedStatusName;
    }

    public String getDebtType() {
        return debtType;
    }

    public void setDebtType(String debtType) {
        this.debtType = debtType;
    }

    public String getDebtTypeName() {
        return debtTypeName;
    }

    public void setDebtTypeName(String debtTypeName) {
        this.debtTypeName = debtTypeName;
    }

    public DebtInfo() {
    }

    public DebtInfo(int id, String debtNo, String contractNo, String debtorsName, String debtorsId, String loanPurpose, String loanType, long loanStartDate, long loanPeriod, long loanEndDate, String repaymentStyle, long repaymenDate, BigDecimal repaymenMoney, BigDecimal debtMoney, BigDecimal debtYearRate, BigDecimal debtMonthRate, BigDecimal debtTransferredMoney, long debtTransferredDate, long debtTransferredPeriod, long debtRansferOutDate, String creditor, String debtStatus, int borrowerId, long availablePeriod, BigDecimal availableMoney, BigDecimal matchedMoney, int matchedStatus, String repaymentStyleName, String debtStatusName, String matchedStatusName, String debtType, String debtTypeName) {
        this.id = id;
        this.debtNo = debtNo;
        this.contractNo = contractNo;
        this.debtorsName = debtorsName;
        this.debtorsId = debtorsId;
        this.loanPurpose = loanPurpose;
        this.loanType = loanType;
        this.loanStartDate = loanStartDate;
        this.loanPeriod = loanPeriod;
        this.loanEndDate = loanEndDate;
        this.repaymentStyle = repaymentStyle;
        this.repaymenDate = repaymenDate;
        this.repaymenMoney = repaymenMoney;
        this.debtMoney = debtMoney;
        this.debtYearRate = debtYearRate;
        this.debtMonthRate = debtMonthRate;
        this.debtTransferredMoney = debtTransferredMoney;
        this.debtTransferredDate = debtTransferredDate;
        this.debtTransferredPeriod = debtTransferredPeriod;
        this.debtRansferOutDate = debtRansferOutDate;
        this.creditor = creditor;
        this.debtStatus = debtStatus;
        this.borrowerId = borrowerId;
        this.availablePeriod = availablePeriod;
        this.availableMoney = availableMoney;
        this.matchedMoney = matchedMoney;
        this.matchedStatus = matchedStatus;
        this.repaymentStyleName = repaymentStyleName;
        this.debtStatusName = debtStatusName;
        this.matchedStatusName = matchedStatusName;
        this.debtType = debtType;
        this.debtTypeName = debtTypeName;
    }

    @Override
    public String toString() {
        return "DebtInfo{" +
                "id=" + id +
                ", debtNo='" + debtNo + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", debtorsName='" + debtorsName + '\'' +
                ", debtorsId='" + debtorsId + '\'' +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", loanType='" + loanType + '\'' +
                ", loanStartDate=" + loanStartDate +
                ", loanPeriod=" + loanPeriod +
                ", loanEndDate=" + loanEndDate +
                ", repaymentStyle='" + repaymentStyle + '\'' +
                ", repaymenDate=" + repaymenDate +
                ", repaymenMoney=" + repaymenMoney +
                ", debtMoney=" + debtMoney +
                ", debtYearRate=" + debtYearRate +
                ", debtMonthRate=" + debtMonthRate +
                ", debtTransferredMoney=" + debtTransferredMoney +
                ", debtTransferredDate=" + debtTransferredDate +
                ", debtTransferredPeriod=" + debtTransferredPeriod +
                ", debtRansferOutDate=" + debtRansferOutDate +
                ", creditor='" + creditor + '\'' +
                ", debtStatus='" + debtStatus + '\'' +
                ", borrowerId=" + borrowerId +
                ", availablePeriod=" + availablePeriod +
                ", availableMoney=" + availableMoney +
                ", matchedMoney=" + matchedMoney +
                ", matchedStatus=" + matchedStatus +
                ", repaymentStyleName='" + repaymentStyleName + '\'' +
                ", debtStatusName='" + debtStatusName + '\'' +
                ", matchedStatusName='" + matchedStatusName + '\'' +
                ", debtType='" + debtType + '\'' +
                ", debtTypeName='" + debtTypeName + '\'' +
                '}';
    }
}
