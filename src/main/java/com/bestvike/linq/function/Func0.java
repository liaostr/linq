package com.bestvike.linq.function;

/**
 * @author 许崇雷
 * @date 2017/7/10
 */
@FunctionalInterface
public interface Func0<TResult> {
    TResult apply();
}