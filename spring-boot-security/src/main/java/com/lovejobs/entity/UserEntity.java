package com.lovejobs.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("password")
    private String password;
}
