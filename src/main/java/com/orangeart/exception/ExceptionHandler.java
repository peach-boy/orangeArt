package com.orangeart.exception;

import com.orangeart.protocal.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 异常处理器
 * @Auther: xiantao.wu
 * @Date: 2021/6/13 15:24
 * @Email:1414924381@qq.com
 */
@ControllerAdvice
public class ExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessRuntimeException.class)
    @ResponseBody
    public ApiResponse handleBusinessException(BusinessRuntimeException e) {
        LOGGER.error("error:{}:{}",e.getErrorCode(),e.getErrorMsg(),e);
        String message = e.getErrorMsg();
        return ApiResponse.fail(e.getErrorCode(), message);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse handleBusinessException(Exception e) {
        LOGGER.error("error:{}",e);
        return ApiResponse.fail(ErrorCode.SYSTEM_ERROR);
    }
}
