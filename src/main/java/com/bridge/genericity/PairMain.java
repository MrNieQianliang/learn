package com.bridge.genericity;

/**
 * @ClassName: PairMain
 * @Author: alan
 * @Description:
 * @Date: 2020/4/21 14:23
 * @Version: 1.0
 */
public class PairMain {

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("first","wecond");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair<Integer> pair1 = new Pair<>(1,2);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

    }
}
