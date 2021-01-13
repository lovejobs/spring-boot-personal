package com.lovejobs.springbootfeign.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthTokenRequest implements Serializable {
    private static final long serialVersionUID = 7138784370143200004L;

    private String username="81C70CC867974F6B8EC82B6A6B617DE1";
    private String grant_type="password";
    private String scope="openid groups";
    private String client_id="sgt-notify-openapi";
    private String password="2EF263E29ADFCB5CB6BC9983817239EF";

    public String getStr(){
        StringBuffer s = new StringBuffer();
        s.append("username=").append(this.username).append("&").append("grant_type=")
                .append(this.grant_type).append("&").append("scope=")
                .append(this.scope).append("&").append("client_id=").append(this.client_id).append("&").append("password=").append(this.password);
        return s.toString();
    }
}
