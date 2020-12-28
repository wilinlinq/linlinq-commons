package com.wilinlinq.core.constant;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;
import static java.io.File.pathSeparator;
import static java.io.File.separator;

/**
 * 字符串常量
 *
 * @author 王磊
 * @since 2020-12-13 9:09
 */
public final class FileConstants {

    /**
     * 私有化构造方法，确保不能实例化
     */
    private FileConstants() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * 文件系统中文件名分隔符，windows系统“\\”，unix系统“/”
     */
    public static final String FILE_NAME_SEPARATOR = separator;

    /**
     * 文件系统中文件路径分隔符，用于分隔多个文件路径。windows系统“;”，unix系统“:”
     */
    public static final String FILE_PATH_SEPARATOR = pathSeparator;

    /**
     * 文件系统中文件换行分隔符，windows系统“\r\n”，unix系统“\n”
     */
    public static final String FILE_LINE_SEPARATOR = System.lineSeparator();
}
