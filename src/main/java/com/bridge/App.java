package com.bridge;

import com.bridge.reflect.reflects.Mlearn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfig.xml");
        Mlearn bean = applicationContext.getBean(Mlearn.class);
        bean.sayHello("123");
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
