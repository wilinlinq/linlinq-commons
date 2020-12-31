package com.wilinlinq.core.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.wilinlinq.core.constant.ConstructorConstants.NON_INSTANTIABILITY;

/**
 * Google json 工具类
 *
 * @author 王磊
 * @since 2020-12-13 10:10
 */
public class GsonUtils {

    /**
     * 私有化构造方法，确保不能实例化
     */
    private GsonUtils() {
        throw new AssertionError(NON_INSTANTIABILITY);
    }

    /**
     * gson 实例
     */
    private static final Gson instance = new Gson();

    /**
     * 对象转 json 字符串
     *
     * @param obj 对象
     * @return json 字符串
     */
    public static String toJson(Object obj) {
        return instance.toJson(obj);
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
        return instance.fromJson(json, classOfT);
    }

    /**
     * json 字符串转数组
     *
     * @param json json 字符串
     * @param <T>  对象类型
     * @return T 类型对象 List
     */
    public static <T> T[] toArray(String json) {
        Type type = new TypeToken<T[]>() {}.getType();
        return instance.fromJson(json, type);
    }

    /**
     * json 字符串转 ArrayList
     *
     * @param json json 字符串
     * @param <T>  对象类型
     * @return T 类型对象 ArrayList
     */
    public static <T> List<T> toArrayList(String json) {
        Type type = new TypeToken<ArrayList<T>>() {}.getType();
        return instance.fromJson(json, type);
    }

    /**
     * json 字符串转 LinkedList
     *
     * @param json json 字符串
     * @param <T>  对象类型
     * @return T 类型对象 LinkedList
     */
    public static <T> List<T> toLinkedList(String json) {
        Type type = new TypeToken<LinkedList<T>>() {}.getType();
        return instance.fromJson(json, type);
    }

    /**
     * json 字符串转 HashSet
     *
     * @param json json 字符串
     * @param <T>  对象类型
     * @return T 类型对象 HashSet
     */
    public static <T> Set<T> toHashSet(String json) {
        Type type = new TypeToken<HashSet<T>>() {}.getType();
        return instance.fromJson(json, type);
    }

    /**
     * json 字符串转对象列表
     *
     * @param json json 字符串
     * @param <K>  map key 对象类型
     * @param <V>  map value 对象类型
     * @return map
     */
    public static <K, V> Map<K, V> toMap(String json) {
        Type type = new TypeToken<Map<K, V>>() {}.getType();
        return instance.fromJson(json, type);
    }
}

