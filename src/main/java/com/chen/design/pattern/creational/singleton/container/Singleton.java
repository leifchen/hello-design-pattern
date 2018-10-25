package com.chen.design.pattern.creational.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 *
 * @Author LeifChen
 * @Date 2018-10-25
 */
public class Singleton {

    private static Map<String, Object> singletonMap = new HashMap<>();

    private Singleton() {
    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
