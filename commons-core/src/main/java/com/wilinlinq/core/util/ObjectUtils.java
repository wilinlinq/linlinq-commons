package com.wilinlinq.core.util;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;

/**
 * 对象工具类
 *
 * @author 王磊
 * @since 2020-12-13 9:45
 */
public final class ObjectUtils {

    /**
     * 私有化构造方法，确保不能实例化
     */
    private ObjectUtils() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * {@code obj}为{@code null}是返回{@code true};否则返回{@code false}
     *
     * @param obj 对象
     * @return {@code obj}为{@code null}是返回{@code true};否则返回{@code false}
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * {@code obj}不为{@code null}是返回{@code true};否则返回{@code false}
     *
     * @param obj 对象
     * @return {@code obj}不为{@code null}是返回{@code true};否则返回{@code false}
     */
    public static boolean isNotNull(Object obj) {
        return obj != null;
    }

    /**
     * 比较两个对象是否相等
     * 如果两个参数都是 {@code null} 返回 {@code true};
     * 如果只有一个参数 {@code null} 返回 {@code false};
     * 否则返回 {@code obj1.equals(obj2)}
     *
     * @param obj1 比较对象
     * @param obj2 被比较对象
     * @return true:相等;false:不相等;
     */
    public static boolean equals(Object obj1, Object obj2) {
        return (obj1 == obj2) || (obj1 != null && obj1.equals(obj2));
    }

    /**
     * 放回对象 hash code
     * 如果对象为 {@code null} 返回 {@code 0}；否则返回 {@code obj.hashCode()}
     *
     * @param obj 对象
     * @return 对象null返回 0;非空返回对象 obj.hashCode()
     */
    public static int hashCode(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    /**
     * {@code obj}为{@code null}时返回{@code "null"}的值,否则返回{@code obj.toString()}
     *
     * @param obj 对象
     * @return {@code obj}为{@code null}时返回{@code "null"}的值,否则返回{@code obj.toString()}
     */
    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    /**
     * {@code obj}为{@code null}时返回 {@code nullDefault}的值,否则返回{@code obj.toString()}
     *
     * @param obj         对象
     * @param nullDefault {@code obj}为{@code null}时返回值
     * @return {@code obj}为{@code null}时返回 {@code nullDefault}的值,否则返回{@code obj.toString()}
     */
    public static String toString(Object obj, String nullDefault) {
        return (obj != null) ? obj.toString() : nullDefault;
    }
}
