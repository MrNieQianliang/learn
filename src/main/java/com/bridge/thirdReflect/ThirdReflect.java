package com.bridge.thirdReflect;

import com.bridge.reflect.reflects.annotion.NqlTest;
import org.reflections.Configuration;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.Method;
import java.util.Set;

/**
 * @ClassName: ThirdReflect
 * @Author: alan
 * @Description:
 * @Date: 2020/4/25 09:46
 * @Version: 1.0
 */
public class ThirdReflect {

    public static void main(String[] args) {

        Configuration configuration = new ConfigurationBuilder()
                .forPackages("com.bridge.reflect")
                .addScanners(new MethodAnnotationsScanner());

        Reflections reflections = new Reflections(configuration);

        Set<Method> methodsAnnotatedWith = reflections.getMethodsAnnotatedWith(NqlTest.class);

        methodsAnnotatedWith.forEach(x->{
            System.out.println(x.getName());
        });

    }
}
