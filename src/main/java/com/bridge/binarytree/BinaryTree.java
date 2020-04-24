package com.bridge.binarytree;

/**
 * @ClassName: BinaryTree
 * @Author: alan
 * @Description:
 * @Date: 2020/4/11 08:34
 * @Version: 1.0
 */
public class BinaryTree implements Tree {

    /**
     * 根节点
     */
    private Node root;

    @Override
    public Node find(int key) {
        return null;
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (root == null){
            root = newNode;
            return true;
        }else {
            Node current = root;
            Node parentNode = null;
            while (current != null){
                parentNode = current;
                if (current.getData() > data){
                    current = current.getLeft();
                    if (current == null){
                        parentNode.setLeft(newNode);
                        return true;
                    }
                }else {
                    current = current.getRight();
                    if (current == null){
                        parentNode.setRight(newNode);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void midOrder(Node current) {
        if (current != null){
            midOrder(current.getLeft());
            current.display();
            midOrder(current.getRight());
        }
    }

    @Override
    public void preOrder(Node current) {

    }

    @Override
    public void afterOrder(Node current) {

    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(12);
        binaryTree.insert(14);
        binaryTree.insert(10);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(90);

        System.out.println("二叉树生成");
        binaryTree.midOrder(binaryTree.root);
    }
}
