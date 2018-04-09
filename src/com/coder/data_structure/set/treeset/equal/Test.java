package com.coder.data_structure.set.treeset.equal;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        Model model = new Model(6);
        treeSet.add(model);
        treeSet.add(model);
        //成功添加了两个model对象到treeSet中
        System.out.println(treeSet);
        //输出的结果显示，这两个对象实际是相等的，之所以能添加成功的原因是compareTo 返回了1，这就表示按当前的示例
        //无论添加对象z对象到TreeSet集合中，都会成功，因为它们始终不相等（也就是compareTo返回值 为 0）
        //[com.collection.z@15db9742, com.collection.z@15db9742]
    }
}
