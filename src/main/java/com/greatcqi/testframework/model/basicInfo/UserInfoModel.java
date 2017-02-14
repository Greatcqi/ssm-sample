package com.greatcqi.testframework.model.basicInfo;

/**
 * User Info model.
 * Created on 2017/2/12.
 * @author XieChen
 * @version  1.0
 */
public class UserInfoModel {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    private String loginPassword;
}
