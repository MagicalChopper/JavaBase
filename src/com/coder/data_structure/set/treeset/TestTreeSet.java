package com.coder.data_structure.set.treeset;

import java.util.TreeSet;

/**
 * 存基本类型
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(9);
        set.add(-2);
        set.add(3);
        set.add(10);
        System.out.println(set);//[-2, 3, 9, 10]
        //输出集合中第一个元素
        System.out.println("set.first() = "+set.first());//set.first() = -2
        //输出集合中最后一个元素
        System.out.println("set.last() = "+set.last());//set.last() = 10
        //返回小于4的子集，不包含4
        System.out.println("set.headSet() = "+set.headSet(4));//set.headSet() = [-2, 3]
        //返回大于5的子集，包含5
        System.out.println("set.tailSet() = "+set.tailSet(5));//set.tailSet() = [9, 10]
        //返回大于等于-3，小于4的子集
        System.out.println("set.subSet() = "+set.subSet(-3, 4));//set.subSet() = [-2, 3]
    }
}
