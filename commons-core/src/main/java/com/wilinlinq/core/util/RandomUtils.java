package com.wilinlinq.core.util;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;

/**
 * 随机数工具类
 *
 * @author 王磊
 * @since 2020-12-13 17:28
 */
public class RandomUtils {

    /**
     * 十进制数字
     */
    private static final char[] DEC_DIGITS;

    /**
     * 十六进制数字
     */
    private static final char[] HEX_DIGITS;

    /**
     * 0
     */
    private static final int ZERO = 0;

    /**
     * 大小必须非负数
     */
    private static final String ERROR_SIZE = "size 必须非负数";

    /**
     * 上限值必须大于0
     */
    private static final String ERROR_BOUND = "bound 必须大于0";

    /**
     * 上限值必须大于下限值
     */
    private static final String ERROR_RANGE = "bound 必须大于 origin";

    /**
     * 数组不为空
     */
    private static final String ERROR_ARRAY = "数组不能为空";

    /**
     * 随机数流
     *
     * @return 随机数流
     */
    public static ThreadLocalRandom random() {
        return ThreadLocalRandom.current();
    }

    /**
     * 私有化构造方法，确保不能实例化
     */
    private RandomUtils() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * 获取随机 boolean 值
     *
     * @return 随机 boolean 值
     */
    public static boolean nextBoolean() {
        return random().nextBoolean();
    }

    /**
     * 获取随机字节数组
     *
     * @param size 返回字节数组大小
     * @return 字节数组
     * @throws IllegalArgumentException {@code size <= 0}
     */
    public static byte[] nextBytes(final int size) {
        if (size < ZERO) {
            throw new IllegalArgumentException(ERROR_SIZE);
        }

        final byte[] result = new byte[size];
        random().nextBytes(result);
        return result;
    }

    /**
     * 返回{@code origin}到{@code bound}之间的整数，不包含{@code bound}
     *
     * @param origin 开始值（包含）
     * @param bound  边界值（不包含）
     * @return 随机整数
     * @throws IllegalArgumentException {@code origin >= bound}
     */
    public static int nextInt(final int origin, final int bound) {
        if (origin >= bound) {
            throw new IllegalArgumentException(ERROR_RANGE);
        }
        return random().nextInt(origin, bound);
    }

    /**
     * 返回{@code 0}到{@code bound}之间的整数，不包含{@code bound}
     *
     * @param bound 边界值（不包含）
     * @return 随机整数
     * @throws IllegalArgumentException {@code bound <= 0}
     */
    public static int nextInt(final int bound) {
        if (bound <= ZERO) {
            throw new IllegalArgumentException(ERROR_BOUND);
        }
        return nextInt(ZERO, bound);
    }

    /**
     * 返回{@code origin}到{@code bound}之间的整数，不包含{@code bound}
     *
     * @param origin 开始值（包含）
     * @param bound  边界值（不包含）
     * @return 随机整数
     * @throws IllegalArgumentException {@code origin >= bound}
     */
    public static long nextLong(final long origin, final long bound) {
        if (origin >= bound) {
            throw new IllegalArgumentException(ERROR_RANGE);
        }
        return random().nextLong(origin, bound);
    }

    /**
     * 返回{@code 0}到{@code bound}之间的整数，不包含{@code bound}
     *
     * @param bound 边界值（不包含）
     * @return 随机整数
     * @throws IllegalArgumentException {@code bound <= 0}
     */
    public static long nextLong(final long bound) {
        if (bound <= ZERO) {
            throw new IllegalArgumentException(ERROR_BOUND);
        }
        return nextLong(ZERO, bound);
    }

    /**
     * 从{@code chars}字符数组中选取{@code size}个字符生成字符数组
     *
     * @param chars 源字符数组
     * @param size  生成的字符数组大小
     * @return 大小为{@code size}的字符数组
     * @throws IllegalArgumentException {@code chars}不为空即{@code chars == null}或者{@code chars.length == 0};
     *                                  {@code size < 0}
     */
    public static char[] nextChars(char[] chars, int size) {
        if (ArrayUtils.isEmpty(chars)) {
            throw new IllegalArgumentException(ERROR_ARRAY);
        }
        if (size < ZERO) {
            throw new IllegalArgumentException(ERROR_SIZE);
        }
        if (size == ZERO) {
            return new char[size];
        }
        int charSize = chars.length;
        char[] randomChars = new char[size];
        for (int i = ZERO; i < size; i++) {
            randomChars[i] = chars[random().nextInt(charSize)];
        }
        return randomChars;
    }

    /**
     * 从{@code chars}字符数组中选取{@code size}个字符生成字符数组
     *
     * @param chars 源字符数组
     * @param size  生成的字符串大小
     * @return 大小为{@code size}的字符串
     * @throws IllegalArgumentException {@code chars}不为空即{@code chars == null}或者{@code chars.length == 0};
     *                                  {@code size < 0}
     */
    public static String nextString(char[] chars, int size) {
        return String.valueOf(nextChars(chars, size));
    }

    /**
     * 生成大小为{@code size}的16进制字符串
     *
     * @param size 生成的字符串大小
     * @return 大小为{@code size}的字符串
     * @throws IllegalArgumentException {@code chars}不为空即{@code chars == null}或者{@code chars.length == 0};
     *                                  {@code size < 0}
     */
    public static String nextHexString(int size) {
        return String.valueOf(nextChars(HEX_DIGITS, size));
    }

    /**
     * 生成大小为{@code size}的10进制字符串
     *
     * @param size 生成的字符串大小
     * @return 大小为{@code size}的字符串
     * @throws IllegalArgumentException {@code chars}不为空即{@code chars == null}或者{@code chars.length == 0};
     *                                  {@code size < 0}
     */
    public static String nextDecString(int size) {
        return String.valueOf(nextChars(DEC_DIGITS, size));
    }

    static {
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        DEC_DIGITS = Arrays.copyOf(RandomUtils.HEX_DIGITS, 10);
    }
}
