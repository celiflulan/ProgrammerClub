package com.jingdianjichi.core.utils;

import com.alibaba.fastjson.JSONObject;
import com.jingdianjichi.core.entity.Context;

import java.util.Map;

/**
 * 使用json构建上下文的上下文工具
 *
 */
public class ContextUtils {

    public static Context buildContext(String json) {

        Context context = new Context();
        JSONObject jsonObject = JSONObject.parseObject(json);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            context.put(entry.getKey(), entry.getValue());
        }
        return context;

    }

}