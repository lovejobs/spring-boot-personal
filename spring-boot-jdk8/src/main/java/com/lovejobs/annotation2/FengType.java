package com.lovejobs.annotation2;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum FengType {
    A("A","AService"),
    B("B","BService");

    private String code;

    private String desc;

    FengType(String code,String descl){
        this.code=code;
        this.desc=descl;
    }

}
