package com.bridge.thread;

import java.awt.image.VolatileImage;

/**
 * @ClassName: ThreadTest
 * @Author: alan
 * @Description:
 * @Date: 2020/4/26 20:03
 * @Version: 1.0
 */
public class ThreadTest {

    private static volatile int count;


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
          for (int i=0 ;i<10000;i++){
              count++;
          }
        });

        Thread t2 = new Thread(()->{
            for (int i=0;i<10000;i++){
                count++;
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count);
    }
}
