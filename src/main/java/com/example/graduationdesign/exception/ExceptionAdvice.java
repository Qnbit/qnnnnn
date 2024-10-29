package com.example.graduationdesign.exception;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.graduationdesign.common.R;
import com.example.graduationdesign.utils.Constants;

@ControllerAdvice
@ResponseBody
@Slf4j
public class ExceptionAdvice {

    //json解析失败
    @ExceptionHandler(JSONException.class)
    public R<String> JSONException() {
        return R.server_error(Constants.JSON_PARSE_ERROR);
    }

    //时间
    @ExceptionHandler(TimeGeneExceprion.class)
    public R<String> TimeGeneExceprion() {
        return R.server_error(Constants.TIME_GENE_ERROR);
    }

    //参数错误
    @ExceptionHandler(ParamException.class)
    public R<String> ParamException(ParamException paramException) {
        if (StrUtil.isNotBlank(paramException.getMsg())){
            return R.error(paramException.getMsg());
        }
        return R.error(Constants.PARAM_ERROR);
    }

}
