package com.coder.data_structure.set.treeset;

import java.util.TreeSet;

/**
 * 错误示例
 * 存不同类型
 */
public class TestTreeSet2 {
    public static void main(String[] args) {
        TreeSet t2 = new TreeSet();
        t2.add("hello");
        t2.add(1);
        //java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
    /**
     * 在实现compareTo(Object o)方法时，都需要将被比较对象obj强制类型转换成相同类型，因为只有相同类的两个示例才会比较大小。
     * 当试图把一个大对象添加到TreeSet集合时，TreeSet会调用该对象的compareTo(Object o)方法与集合中的其他元素进行比较—这就
     * 要求集合中的其他元素与该元素是同一类的示例，否则抛出ClassCaseException异常。
     */
    }
}
