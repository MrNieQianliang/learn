package com.bridge.genericity;

import sun.reflect.generics.scope.Scope;

/**
 * @ClassName: Pair
 * @Author: alan
 * @Description:
 * @Date: 2020/4/21 14:17
 * @Version: 1.0
 */
public class Pair<T> {

    T first;
    T second;

    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
