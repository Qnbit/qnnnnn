package com.example.graduationdesign.exception;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONException;
import com.example.graduationdesign.common.QN;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.graduationdesign.utils.Constants;

@ControllerAdvice
@ResponseBody
@Slf4j
public class ExceptionAdvice {

    //json解析失败
    @ExceptionHandler(JSONException.class)
    public QN<String> JSONException() {
        return QN.server_error(Constants.JSON_PARSE_ERROR);
    }

    //时间
    @ExceptionHandler(TimeGeneExceprion.class)
    public QN<String> TimeGeneExceprion() {
        return QN.server_error(Constants.TIME_GENE_ERROR);
    }

    //参数错误
    @ExceptionHandler(ParamException.class)
    public QN<String> ParamException(ParamException paramException) {
        if (StrUtil.isNotBlank(paramException.getMsg())){
            return QN.error(paramException.getMsg());
        }
        return QN.error(Constants.PARAM_ERROR);
    }

}
