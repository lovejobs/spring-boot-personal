package com.lovejobs.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "app_id")
public class AppIdTable {

    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "app_id")
    private String appId;  //tr

    @Column(name = "code")
    private String code;  //tr

    @Column(name = "create_time")
    private Date createTime;



}
