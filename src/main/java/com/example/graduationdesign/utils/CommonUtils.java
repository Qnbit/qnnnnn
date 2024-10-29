package com.example.graduationdesign.utils;

import com.example.graduationdesign.exception.TimeGeneExceprion;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class CommonUtils {
    private final static String webUrl = "http://www.baidu.com";

    //获取网络时间
    public static String getCurrentTime() {
        try {
            URL url = new URL(webUrl);// 取得资源对象
            URLConnection uc = url.openConnection();// 生成连接对象
            uc.connect();// 发出连接
            long ld = uc.getDate();// 读取网站日期时间
            Date date = new Date(ld);// 转换为标准时间对象
            SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_TIME, Locale.CHINA);// 输出北京时间
            return sdf.format(date);
        } catch (IOException e) {
            throw new TimeGeneExceprion();
        }
    }
}