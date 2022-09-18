package com.qihang.objectiondetectioncomputer.Utils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qihang
 * @create 2022-09-17 上午  11:38
 */

@RestControllerAdvice
public class GlobalException {


    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request) {
        ex.printStackTrace();
        System.out.println("RUNTIME EXCEPTION CATCH");
        return ResponseEntity.ok("RUNTIME EXCEPTION CATCH");
    }

}
