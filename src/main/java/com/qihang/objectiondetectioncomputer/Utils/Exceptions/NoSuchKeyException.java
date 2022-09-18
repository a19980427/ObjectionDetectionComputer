package com.qihang.objectiondetectioncomputer.Utils.Exceptions;

/**
 * @author qihang
 * @create 2022-09-18 下午  02:52
 */
public class NoSuchKeyException extends BaseException {

    public NoSuchKeyException(String module, String code, Object[] args, String defaultMessage) {
        super(module, code, args, "redis no such key");
    }
}
