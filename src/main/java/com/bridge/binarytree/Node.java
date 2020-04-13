package com.bridge.binarytree;

/**
 * @ClassName: Node
 * @Author: alan
 * @Description: 树的节点结构
 * @Date: 2020/4/11 08:18
 * @Version: 1.0
 */
public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
    }

    public void display(){
        System.out.println(data);
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
