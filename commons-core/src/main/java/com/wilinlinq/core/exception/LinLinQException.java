package com.wilinlinq.core.exception;

/**
 * 自定义基础异常
 *
 * @author 王磊
 * @since 2020-12-13 10:55
 */
public class LinLinQException extends Exception {

    private static final long serialVersionUID = -4139449128966769637L;

    /**
     * 构造方法
     */
    public LinLinQException() {
        super();
    }

    /**
     * 构造方法
     *
     * @param message 异常详情信息
     */
    public LinLinQException(String message) {
        super(message);
    }

    /**
     * 构造方法
     *
     * @param message 异常详情信息
     * @param cause   原因
     */
    public LinLinQException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造方法
     *
     * @param cause 原因
     */
    public LinLinQException(Throwable cause) {
        super(cause);
    }
}
