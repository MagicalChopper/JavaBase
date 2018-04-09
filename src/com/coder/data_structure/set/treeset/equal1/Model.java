package com.coder.data_structure.set.treeset.equal1;

public class Model implements Comparable{
    private int size;

    public Model(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        Model model = (Model) o;
        return this.size>model.size?1:this.size<model.size?-1:0;
    }

    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }

        if(obj != null && obj.getClass() == Model.class)
        {
            Model model = (Model)obj;//类型转换
            return model.size == this.size;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Model{" +
                "size=" + size +
                '}';
    }
}
