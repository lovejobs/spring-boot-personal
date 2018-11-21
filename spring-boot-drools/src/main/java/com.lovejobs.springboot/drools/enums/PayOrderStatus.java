package com.lovejobs.springboot.drools.enums;

import lombok.Getter;

@Getter
public enum PayOrderStatus {

    PAYORDER_STATUS_WAIT(0, "待支付"),
    PAYORDER_STATUS_SUCCESS(1, "支付成功"),
    PAYORDER_STATUS_FAIL(2, "支付失败"),
    PAYORDER_STATUS_CLOSED(3, "支付关闭");

    private int code;

    private String desc;

    PayOrderStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
