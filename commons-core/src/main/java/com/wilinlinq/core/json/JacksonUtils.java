package com.wilinlinq.core.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wilinlinq.core.exception.JsonRuntimeException;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;

/**
 * jackson json 工具类
 *
 * @author 王磊
 * @since 2020-12-13 10:10
 */
public class JacksonUtils {

    /**
     * 私有化构造方法，确保不能实例化
     */
    private JacksonUtils() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * ObjectMapper 实例
     */
    private static final ObjectMapper instance = new ObjectMapper();

    /**
     * 对象转 json 字符串
     *
     * @param obj 对象
     * @return json 字符串
     */
    public static String toJson(Object obj) {
        try {
            return instance.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e.getMessage(), e);
        }
    }

    /**
     * json 字符串转对象
     *
     * @param json     json 字符串
     * @param classOfT T 的 class
     * @param <T>      对象类型
     * @return T 类型对象
     */
    public static <T> T toObject(String json, Class<T> classOfT) {
        try {
            return instance.readValue(json, classOfT);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e.getMessage(), e);
        }
    }

    /**
     * json 字符串转数组
     *
     * @param json     json 字符串
     * @param <T>      对象类型
     * @return T 类型对象 List
     */
    public static <T> T[] toArray(String json) {
        TypeReference<T[]> type = new TypeReference<T[]>() {};
        try {
            return instance.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e.getMessage(), e);
        }
    }

    /**
     * json 字符串转 List
     *
     * @param json     json 字符串
     * @param <T>      对象类型
     * @return T 类型对象 List
     */
    public static <T> List<T> toList(String json) {
        TypeReference<List<T>> type = new TypeReference<List<T>>() {};
        try {
            return instance.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e.getMessage(), e);
        }
    }

    /**
     * json 字符串转 Set
     *
     * @param json     json 字符串
     * @param <T>      对象类型
     * @return T 类型对象 Set
     */
    public static <T> Set<T> toSet(String json) {
        TypeReference<Set<T>> type = new TypeReference<Set<T>>() {};
        try {
            return instance.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e.getMessage(), e);
        }
    }

    /**
     * json 字符串转对象列表
     *
     * @param json     json 字符串
     * @param <K>      map key 对象类型
     * @param <V>      map value 对象类型
     * @return map
     */
    public static <K, V> Map<K, V> toMap(String json) {
        TypeReference<Map<K, V>> type = new TypeReference<Map<K, V>>() {};
        try {
            return instance.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e.getMessage(), e);
        }
    }
}
