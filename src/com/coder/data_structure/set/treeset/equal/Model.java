package com.coder.data_structure.set.treeset.equal;

public class Model implements Comparable {
    private int size;

    public Model(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        //设置恒为不等
        return 1;
    }

    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Model{" +
                "size=" + size +
                '}';
    }
}
