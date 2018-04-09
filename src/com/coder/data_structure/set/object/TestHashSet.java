package com.coder.data_structure.set.object;

import java.util.HashSet;

/**
 * 测试hashCode和equals的重写
 */
public class TestHashSet {
    public static void main(String[] args) {

        HashSet<Point> hs=new HashSet<Point>();

        Point p1=new Point(3,4);

        Point p2=new Point(6,4);

        Point p3=new Point(10,7);

        Point p4=new Point(8,9);

        Point p5=new Point(3,4);

        hs.add(p1);

        hs.add(p2);

        hs.add(p3);

        hs.add(p4);

        hs.add(p5);

        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());

        System.out.println(p2.hashCode());

        System.out.println(hs);

    }
}
