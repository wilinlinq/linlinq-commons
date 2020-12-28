package com.wilinlinq.core.exception;

/**
 * 自定义基础异常
 *
 * @author 王磊
 * @since 2020-12-13 10:56
 */
public class LinLinQRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -3423834200758398288L;

    /**
     * 构造方法
     */
    public LinLinQRuntimeException() {
        super();
    }

    /**
     * 构造方法
     *
     * @param message 异常详情信息
     */
    public LinLinQRuntimeException(String message) {
        super(message);
    }

    /**
     * 构造方法
     *
     * @param message 异常详情信息
     * @param cause   原因
     */
    public LinLinQRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造方法
     *
     * @param cause 原因
     */
    public LinLinQRuntimeException(Throwable cause) {
        super(cause);
    }
}
