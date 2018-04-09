package com.coder.data_structure.set.treeset;

import java.util.TreeSet;

/**
 * 存对象
 */
public class TestTreeSet1 {
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet();
        t1.add(new Err());
        t1.add(new Err());
        //Exception in thread "main" java.lang.ClassCastException:
        /**
         * 原因：
         * TreeSet集合中添加两个Err对象，添加第一个对象时，TreeSet里没有任何元素，
         * 所以不会出现任何问题；当添加第二个Err对象时，TreeSet就会调用该对象的
         * compareTo(Object obj)方法与集合中的其他元素进行比较—如果其对应的类没
         * 有实现Comparable 接口，则会引发ClassCastException异常。
         */

    }
        static class Err{

        }
}
