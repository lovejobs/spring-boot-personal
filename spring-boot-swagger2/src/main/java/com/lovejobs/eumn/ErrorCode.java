package com.lovejobs.eumn;

/**
 * @author
 **/
public enum ErrorCode {

    SUCCESS(200, "success"),
    INVALID_PARAM(400, "param invalid"),
    NAME_REPEAT(1001, "name is repeat"),
    E_SYSTEM(500, "service is unavailable"),
    UPDATE_FAILURE(1002, "update wrong for incorrect id"),
    WHITELIST_ERROR(1003, "same user_id cannot in different whitelist groups");

    private int code;
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
