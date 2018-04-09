package com.coder.data_structure.set.treeset.equal1;

import java.util.TreeSet;

/**
 * 升序排列
 */
public class Test {
    public static void main(String[] args) {
        TreeSet t5 = new TreeSet();
        t5.add(new Model(6));
        t5.add(new Model(6));
        t5.add(new Model(-6));
        t5.add(new Model(1));
        System.out.println(t5);
        //对重复的元素6进行了对比，输出结果显示只有，6、-6、1
        //[com.collection.R1@6d06d69c, com.collection.R1@7852e922, com.collection.R1@4e25154f]
    }
}
