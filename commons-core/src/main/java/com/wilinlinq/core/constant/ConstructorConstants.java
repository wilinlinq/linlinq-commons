package com.wilinlinq.core.constant;

/**
 * 构造器常量
 *
 * @author 王磊
 * @since 2020-12-13 16:02
 */
public final class ConstructorConstants {

    /**
     * 不可实例化
     */
    public static final String NON_INSTANTIABILITY = "ensuring non-instantiability";

    /**
     * 私有化构造方法，确保不能实例化
     */
    private ConstructorConstants() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }
}
