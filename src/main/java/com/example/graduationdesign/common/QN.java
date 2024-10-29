package com.example.graduationdesign.common;

import lombok.Data;
import com.example.graduationdesign.utils.CommonUtils;
import com.example.graduationdesign.utils.StatusEnum;

/**
 * 统一返回信息
 */
@Data
public class QN<T> {

    private Integer status;//状态码

    private String message;//返回信息

    private T data;//返回数据

    private String timestamp;//接口调用时间

    public QN() {
        this.timestamp = CommonUtils.getCurrentTime();
    }

    public static <T> QN<T> success() {
        QN<T> r = new QN<>();
        r.setStatus(StatusEnum.OK.getCode());
        r.setMessage(StatusEnum.OK.getMsg());
        r.setTimestamp(CommonUtils.getCurrentTime());
        return r;
    }

    public static <T> QN<T> success(T data) {
        QN<T> r = new QN<>();
        r.setStatus(StatusEnum.OK.getCode());
        r.setMessage(StatusEnum.OK.getMsg());
        r.setData(data);
        r.setTimestamp(CommonUtils.getCurrentTime());
        return r;
    }

    public static <T> QN<T> error(String msg) {
        QN<T> r = new QN<>();
        r.setStatus(StatusEnum.BAD_REQUEST.getCode());
        r.setMessage(msg);
        r.setTimestamp(CommonUtils.getCurrentTime());
        return r;
    }

    public static <T> QN<T> server_error(String msg) {
        QN<T> r = new QN<>();
        r.setStatus(StatusEnum.SERVER_ERROR.getCode());
        r.setMessage(msg);
        return r;
    }
}