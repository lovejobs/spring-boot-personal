package com.lovejobs.vo;

import lombok.Data;

@Data
public class Father {

    private Integer id;

    private String fname;

    private Son son;

    public Father(Integer id, String fname, Son son) {
        this.id = id;
        this.fname = fname;
        this.son = son;
    }
}
