package com.example.graduationdesign.utils;

import lombok.Getter;

@Getter
public enum StatusEnum {
    OK(200, Constants.OK),//请求成功
    BAD_REQUEST(400, Constants.BAD_REQUEST),//客户端错误
    SERVER_ERROR(500, Constants.SERVER_ERROR);//服务器内部错误

    private final Integer code;//返回状态码
    private final String msg;//返回状态码

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
