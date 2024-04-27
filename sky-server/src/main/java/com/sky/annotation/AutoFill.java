package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解 AutoFill，用于标识需要进行公共字段自动填充的方法
 */
@Target(ElementType.METHOD)         //指定当前注解加在方法上面
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型 update insert
    OperationType value();
}
