package com.coder.data_structure.linked_list;

/**
 * 定义结点
 */
public class Node {

    public String name;
    public int value;
    public Node next;

    public Node() {
    }

    public Node(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
