package com.lovejobs.vo;

import lombok.Data;

@Data
public class Son {

    private Integer id;

    private String sonName;

    public Son(Integer id, String sonName) {
        this.id = id;
        this.sonName = sonName;
    }
}
