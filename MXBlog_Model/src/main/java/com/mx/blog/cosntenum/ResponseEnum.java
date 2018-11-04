package com.mx.blog.cosntenum;

/**
 * @author ShangGuanMingPeng
 * date: 2018/8/24 14:53
 * Description:
 */
public enum ResponseEnum {

    SYSTEM_EXCEPTION(0, 0, "系统异常"),
    SUCCESS(1, 1, "请求成功"),
    FAILED(0, 2, "请求失败"),
    BUSINESS_EXCEPTION(0, 3, "业务异常");

    private int code;

    private int status;

    private String message;

    ResponseEnum(int status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
