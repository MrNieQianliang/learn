package com.bridge.thread;

/**
 * @ClassName: ImplRunable
 * @Author: alan
 * @Description:
 * @Date: 2020/4/28 13:57
 * @Version: 1.0
 */
public class ImplRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("实现Runable实现多线程");
    }
}
