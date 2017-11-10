package com.p2p.beans;

/**
 * Created by Administrator on 2017/11/4.
 */
public class PreUsers {
    //id
    private int id;
    //用户邮箱
    private String email;
    //邮箱验证
    private int emailStatus;
    //用户id
    private String identity;
    //邀请码
    private String inviteid;
    //登录ip
    private String ip;
    //登录时间
    private long loginTime;
   //锁
    private int onlock;
    //登录密码
    private String password;
    //支付密码
    private String payPassword;
    //支付密码验证
    private int payPwdStatus;
    //电话
    private String phone;
    //手机验证
    private int phoneStatus;
    //随机激活码
    private String randomCode;
    //真实姓名
    private String realName;
    //实名验证
    private int realNameStatus;
    //注册时间
    private long registerTime;
    //备注
    private String remark;
    //好友数量
    private int sumFriends;
    //安全等级
    private int userSecure;
    //用户类型0投资人1借款
    private int userType;
    //用户登录名
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(int emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getInviteid() {
        return inviteid;
    }

    public void setInviteid(String inviteid) {
        this.inviteid = inviteid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }

    public int getOnlock() {
        return onlock;
    }

    public void setOnlock(int onlock) {
        this.onlock = onlock;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public int getPayPwdStatus() {
        return payPwdStatus;
    }

    public void setPayPwdStatus(int payPwdStatus) {
        this.payPwdStatus = payPwdStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(int phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getRealNameStatus() {
        return realNameStatus;
    }

    public void setRealNameStatus(int realNameStatus) {
        this.realNameStatus = realNameStatus;
    }

    public long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(long registerTime) {
        this.registerTime = registerTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSumFriends() {
        return sumFriends;
    }

    public void setSumFriends(int sumFriends) {
        this.sumFriends = sumFriends;
    }

    public int getUserSecure() {
        return userSecure;
    }

    public void setUserSecure(int userSecure) {
        this.userSecure = userSecure;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
