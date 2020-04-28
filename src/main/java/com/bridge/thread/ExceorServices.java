package com.bridge.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: ExceorServices
 * @Author: alan
 * @Description: 线程池的使用方式
 * @Date: 2020/4/28 13:59
 * @Version: 1.0
 */
public class ExceorServices {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        InhenrtThread inhenrtThread = new InhenrtThread();

        executorService.submit(inhenrtThread);

        executorService.shutdown();

    }
}
