package com.coder.data_structure.set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);
    }
}
