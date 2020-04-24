package com.bridge.classloader;

import java.io.InputStream;

/**
 * @ClassName: ReadProperties
 * @Author: alan
 * @Description:
 * @Date: 2020/4/21 21:50
 * @Version: 1.0
 */
public class ReadProperties {

    public static void main(String[] args) {

        ReadProperties readProperties = new ReadProperties();

        Class<? extends ReadProperties> aClass = readProperties.getClass();

        ClassLoader classLoader = aClass.getClassLoader();

        InputStream resourceAsStream = classLoader.getResourceAsStream("application.properties");

        System.out.println("读取文件");
    }
}
