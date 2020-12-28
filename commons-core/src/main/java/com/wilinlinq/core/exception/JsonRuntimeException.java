package com.wilinlinq.core.exception;

/**
 * json 异常
 *
 * @author 王磊
 * @since 2020-12-13 11:05
 */
public class JsonRuntimeException extends LinLinQRuntimeException {

    /**
     * 构造方法
     *
     * @param message 异常详情信息
     */
    public JsonRuntimeException(String message) {
        super(message);
    }

    /**
     * 构造方法
     *
     * @param message 异常详情信息
     * @param cause   原因
     */
    public JsonRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
