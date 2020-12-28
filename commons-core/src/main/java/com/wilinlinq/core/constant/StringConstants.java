package com.wilinlinq.core.constant;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;

/**
 * 字符串常量
 *
 * @author 王磊
 * @since 2020-12-13 9:09
 */
public final class StringConstants {

    /**
     * 私有化构造方法，确保不能实例化
     */
    private StringConstants() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * 反斜杠
     */
    public static final String BACKSLASH = "/";

    /**
     * 逗号
     */
    public static final String COMMA = ",";

    /**
     * 空格
     */
    public static final String SPACE = " ";

    /**
     * 空字符串
     */
    public static final String EMPTY = "";

    /**
     * 冒号
     */
    public static final String COLON = ":";

    /**
     * 连字符
     */
    public static final String HYPHEN = "-";

    /**
     * 换行分隔符，换行符 LF ({@code '\n'}, Unicode 000a).
     */
    public static final String LINE_SEPARATOR_LF = "\n";

    /**
     * 换行分隔符，回车符 CR ('\r', Unicode 000d).
     */
    public static final String LINE_SEPARATOR_CR = "\n";
}
