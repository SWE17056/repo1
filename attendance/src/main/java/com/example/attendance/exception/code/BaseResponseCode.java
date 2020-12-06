package com.example.attendance.exception.code;

public enum BaseResponseCode implements ResponseCodeInterface{
    SUCCESS(0,"操作成功")
    ;


    BaseResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private final int code;

    private final String msg;

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMsg() {
        return null;
    }
}
