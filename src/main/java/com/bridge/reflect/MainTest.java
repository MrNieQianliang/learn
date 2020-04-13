package com.bridge.reflect;

import com.bridge.reflect.reflects.annotion.NqlTest;

import java.lang.reflect.Method;

/**
 * @ClassName: MainTest
 * @Author: alan
 * @Description:
 * @Date: 2020/4/10 17:08
 * @Version: 1.0
 */
public class MainTest {

    public static void main(String[] args) throws Exception {
        Class<?> mLearn = Class.forName("com.bridge.reflect.reflects.Mlearn");
        Method[] methods = mLearn.getMethods();
        Object instance = mLearn.newInstance();
        for (Method method : methods) {
            boolean annotationPresent = method.isAnnotationPresent(NqlTest.class);
            if (annotationPresent){
                System.out.println("开始执行的时间戳" + System.currentTimeMillis());
                method.invoke(instance,"123");
                System.out.println(method.getName());
                System.out.println("执行结束的时间戳" + System.currentTimeMillis());
            }

        }
    }
}
