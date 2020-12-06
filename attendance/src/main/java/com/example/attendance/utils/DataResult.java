package com.example.attendance.utils;

import com.example.attendance.exception.code.BaseResponseCode;
import com.example.attendance.exception.code.ResponseCodeInterface;
import lombok.Data;

import java.util.List;
@Data
public class DataResult<T> {
    private int code = 0;
    private String msg;
    private T data;

    public DataResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DataResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public DataResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public DataResult(){
        this.msg= BaseResponseCode.SUCCESS.getMsg();
        this.code=BaseResponseCode.SUCCESS.getCode();
        this.data=null;
    }

    public DataResult(T data){
        this.msg= BaseResponseCode.SUCCESS.getMsg();
        this.code=BaseResponseCode.SUCCESS.getCode();
        this.data=data;
    }

    public DataResult(ResponseCodeInterface responseCodeInterface){
        this.code=responseCodeInterface.getCode();
        this.msg=responseCodeInterface.getMsg();
        this.data=null;
    }

    public DataResult(ResponseCodeInterface responseCodeInterface,T data){
        this.code=responseCodeInterface.getCode();
        this.msg=responseCodeInterface.getMsg();
        this.data=data;
    }


    public static <T>DataResult getResult(int code, String msg, T data)
    {
        return new DataResult(code,msg,data);
    }

    public static DataResult getResult(int code, String msg)
    {
        return new DataResult(code,msg);
    }

    public static <T>DataResult getResult(int code,  T data)
    {
        return new DataResult(code,data);
    }

    public static DataResult getResult(ResponseCodeInterface responseCodeInterface){
        return  new DataResult(responseCodeInterface);
    }

    public static <T>DataResult getResult(ResponseCodeInterface responseCodeInterface,T data){
        return  new DataResult(responseCodeInterface);
    }

    public static DataResult success(){
        return new DataResult();
    }

    public static <T>DataResult success(T data){
        return new DataResult(data);
    }

}
