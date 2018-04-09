package com.coder.data_structure.set.treeset.equal2;

import java.util.TreeSet;

/**
 * 降序
 */
public class Test {
    public static void main(String[] args) {
        TreeSet t5 = new TreeSet();
        t5.add(new Model(6));
        t5.add(new Model(7));
        t5.add(new Model(-2));
        t5.add(new Model(4));
        System.out.println(t5);
    }
}
