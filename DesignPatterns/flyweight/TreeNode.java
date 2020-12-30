package com.example.reidsspringboot.gof23.flyweight;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/5 14:46
 * @Description:
 */
public class TreeNode {
    private int x;
    private int y;
    private Tree tree;

    public TreeNode(int x, int y, Tree tree) {
        this.x = x;
        this.y = y;
        this.tree = tree;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public Tree getTree() {
        return tree;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "x=" + x +
                ", y=" + y +
                ", tree=" + tree.hashCode() +
                '}';
    }
}