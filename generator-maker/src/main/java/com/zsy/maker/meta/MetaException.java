package com.zsy.maker.meta;

/**
 * 元信息异常
 * @author zhusiyuan
 * @date 2023/12/10
 * @apiNote
 */
public class MetaException extends RuntimeException{

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
