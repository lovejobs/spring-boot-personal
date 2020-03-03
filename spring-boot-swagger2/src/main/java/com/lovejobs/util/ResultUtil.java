package com.lovejobs.util;


import com.lovejobs.eumn.ErrorCode;
import com.lovejobs.vo.Result;

/**
 * result reponse
 */
public class ResultUtil {

    /**
     * reponse success
     *
     * @param data
     * @return
     */
    public static Result ok(Object data) {

        Result result = new Result();
        result.setResult_code(ErrorCode.SUCCESS.getCode());
        result.setMsg(ErrorCode.SUCCESS.getMsg());
        result.setData(data);
        result.setTimestamp(System.currentTimeMillis());
        return result;

    }

    /**
     * response fail
     *
     * @return
     */
    public static Result fail() {

        Result result = new Result();
        result.setResult_code(ErrorCode.E_SYSTEM.getCode());
        result.setMsg(ErrorCode.E_SYSTEM.getMsg());
        result.setData(null);
        result.setTimestamp(System.currentTimeMillis());
        return result;

    }

    /**
     * resonse fail
     *
     * @return
     */
    public static Result failWithMsg(ErrorCode errorCode) {

        Result result = new Result();
        result.setResult_code(errorCode.getCode());
        result.setMsg(errorCode.getMsg());
        result.setData(null);
        result.setTimestamp(System.currentTimeMillis());
        return result;

    }
}
