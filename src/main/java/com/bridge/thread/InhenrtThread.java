package com.bridge.thread;

/**
 * @ClassName: InhenrtThread
 * @Author: alan
 * @Description:
 * @Date: 2020/4/28 13:56
 * @Version: 1.0
 */
public class InhenrtThread extends Thread {

    @Override
    public void run() {
        System.out.println("继承Thread类实现多线程");
    }
}
