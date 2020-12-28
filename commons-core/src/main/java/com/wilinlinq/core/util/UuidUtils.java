package com.wilinlinq.core.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;
import static com.wilinlinq.core.constant.StringConstants.EMPTY;
import static com.wilinlinq.core.constant.StringConstants.HYPHEN;

/**
 * UUID工具类
 *
 * @author 王磊
 * @since 2020-12-13 17:28
 */
public class UuidUtils {

    /**
     * 私有化构造方法，确保不能实例化
     */
    private UuidUtils() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * 空UUID
     */
    public static final String EMPTY32 = "00000000000000000000000000000000";

    /**
     * 空UUID
     */
    public static final String EMPTY36 = "00000000-0000-0000-0000-000000000000";

    /**
     * 是否为空UUID
     *
     * @param uuid UUID字符串
     * @return true:空UUID;false:非空
     */
    public static boolean isEmpty(String uuid) {
        return StringUtils.equals(EMPTY32, uuid) || StringUtils.equals(EMPTY36, uuid);
    }

    /**
     * 是否为非空UUID
     *
     * @param uuid UUID字符串
     * @return true:非空;false:空
     */
    public static boolean isNotEmpty(String uuid) {
        return !isEmpty(uuid);
    }

    /**
     * {@code uuid1}和{@code uuid2}是否相等
     *
     * @param uuid1 uuid字符串1
     * @param uuid2 uuid字符串2
     * @return true:相等;false:不相等
     */
    public static boolean equals(String uuid1, String uuid2) {
        return StringUtils.equals(uuid1, uuid2);
    }

    /**
     * 含有连字符{@code -},例如{@code 6c45dc30-b139-454b-bb34-6b86ad20de2d}
     *
     * @return 长度36的字符串
     */
    public static String uuid36() {
        return UUID.randomUUID().toString();
    }

    /**
     * 含有连字符{@code -}且大写字符,例如{@code 3B7844AE-D497-427B-82A4-948A5DC007CA}
     *
     * @return 长度36且全大写的字符串
     */
    public static String uuid36Upper() {
        return uuid36().toUpperCase();
    }

    /**
     * 不含有连字符{@code -},例如{@code 4ad2fb1648614fb5b6c50511e1ca4c74}
     *
     * @return 长度32的字符串
     */
    public static String uuid32() {
        return uuid36().replace(HYPHEN, EMPTY);
    }

    /**
     * 不含有连字符{@code -}且大写字符,例如{@code 224A190BF6A84856A9C352B4B73C9823}
     *
     * @return 长度32且全大写的字符串
     */
    public static String uuid32Upper() {
        return uuid32().toUpperCase();
    }
}
