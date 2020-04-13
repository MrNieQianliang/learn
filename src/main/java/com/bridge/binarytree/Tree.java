package com.bridge.binarytree;

/**
 * @ClassName: Tree
 * @Author: alan
 * @Description: 操作树的基础方法
 * @Date: 2020/4/11 08:28
 * @Version: 1.0
 */
public interface Tree {

    Node find(int key);

    boolean insert(int data);

    void midOrder(Node current);

    void preOrder(Node current);

    void afterOrder(Node current);
}
