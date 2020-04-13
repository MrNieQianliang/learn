package com.bridge.reflect.reflects.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: NqlTest
 * @Author: alan
 * @Description:
 * @Date: 2020/4/10 20:49
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NqlTest {
    String name() default "Nieqianliang";
}
