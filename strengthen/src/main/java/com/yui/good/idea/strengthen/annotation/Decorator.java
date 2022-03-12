package com.yui.good.idea.strengthen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 修饰器
 *
 * @author Yui_HTT
 * @version 1.0.0
 * @date 2022-03-06
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Decorator {

    String method();

}
