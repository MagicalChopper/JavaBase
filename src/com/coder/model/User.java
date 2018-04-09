package com.coder.model;

import java.io.Serializable;

public class User implements Serializable  {

    private static final long serialVersionUID = 8294180014912103005L;

    private int id;
    private String name;

    public User() {}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
       return this.name.hashCode()+this.id*11;
//       return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        /**
         * 这里用到了instanceof操作符，这个操作符和== ，>=是同种性质的，
         * 只是是用英文描述的，是二元操作符，用来判断左边的是否为这个特定类或者是它的子类的一个实例。
         */
        if(!(obj instanceof User))
            return false;

        User s = (User) obj;
        return this.name.equals(s.name) && this.id==s.id;
    }
}
