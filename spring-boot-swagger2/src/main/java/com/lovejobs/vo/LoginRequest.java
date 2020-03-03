package com.lovejobs.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户登陆实体")
public class LoginRequest {
    @ApiModelProperty(name="userName",value = "用户名称",required = true)
    private String userName;
    @ApiModelProperty(name="userPassword",value = "用户密码",required = true)
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
