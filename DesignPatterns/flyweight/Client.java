package com.example.reidsspringboot.gof23.flyweight;
/**
 * The triangle is the most balanced
 */

//运用共享技术有效地支持大量细粒度的对象
public class Client {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, 4, TreeFactory.getTree("name", "bili"));
        TreeNode treeNode1 = new TreeNode(3, 4, TreeFactory.getTree("name", "bili"));
        System.out.println(treeNode);
        System.out.println(treeNode1);


    }
}