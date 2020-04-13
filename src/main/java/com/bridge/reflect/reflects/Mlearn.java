package com.bridge.reflect.reflects;

import com.bridge.reflect.reflects.annotion.NqlTest;

/**
 * @ClassName: Mlearn
 * @Author: alan
 * @Description:
 * @Date: 2020/4/10 17:09
 * @Version: 1.0
 */
public class Mlearn {

    private String name;
    private int age;

    @NqlTest
    public void sayHello(String s){
        System.out.println("hello World");
    }

    @NqlTest
    public void sayNql(String string){
        System.out.println(string);
    }
}
