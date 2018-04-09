package com.coder.data_structure.set;

import com.coder.data_structure.model.User;

import java.util.HashSet;

/**
 * 一个实例问题，在这种添加自定义对象的时候，两个类的属性值相等，但是依然会被判定为不同的元素，
 * 因为没有重写hashCode()，所以默认调用的是Object类的hashCode()，而不同类的hashCode一般是不同的。
 * 解决方法就是自己重写hashCode() 和 equals()方法，使用idea的alt+insert可以自动生成。
 * (！！可以测试下User类没有重写hashCode()和equals()方法和重写之后的HashSet对象输出效果)
 */
public class TestHashSet1 {
    public static void main(String[] args) {
        HashSet<User> hashSet = new HashSet<>();

        User s1 = new User( 22,"刘亦菲");
        User s2 = new User( 25,"章子怡");
        User s3 = new User( 22,"刘亦菲");

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        System.out.println(hashSet);
    }
}
