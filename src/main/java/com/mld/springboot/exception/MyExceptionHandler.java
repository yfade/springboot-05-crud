package com.mld.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code",500);
        Map<String, Object> map = new HashMap<>();
        map.put("aaa", "111");
        map.put("bbb", "222");
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}
