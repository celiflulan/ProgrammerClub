package com.jingdianjichi.core.utils;

import com.jingdianjichi.core.entity.Context;

/**
 * 获取全局上下文的配置工具
 *
 */
public class ConfigUtils {

    private static Context ctx = new Context();

    public static Context getContext() {
        return ctx;
    }

    public static void reSetContext(Context context) {
        ctx = context;
    }

}
