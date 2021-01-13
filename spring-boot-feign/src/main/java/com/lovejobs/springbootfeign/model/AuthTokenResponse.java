package com.lovejobs.springbootfeign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class AuthTokenResponse implements Serializable {
    private static final long serialVersionUID = 1237412680362413480L;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private Long expiresIn;

    @JsonProperty("id_token")
    private String idToken;
}
