package com.coder.data_structure.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Set测试类:主要测试Set的无序
 */
public class TestHashSet {


    /**
     * @param args
     */
    public static void main(String[] args) {

        Set set = new HashSet();

        /**
         * 你会发现在jdk1.8中Set如果存储的值过小的话，它看似有序
         */
//        set.add(1);
//        set.add(2);
//        set.add(5);
//        set.add(3);
//        set.add(3);
//        set.add(4);

        /**
         * 改变一下插入数据，输出又会不一样
         */
        Random rand=new Random(47);
        for (int i=0;i<10000;i++){
            set.add(rand.nextInt(30) + (1 << 16));
        }

//        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+"");
        }

        /**
         * 为什么呢，是因为JDK8版java.util.HashMap内的hash算法比JDK7版的混淆程度低，
         * 在[0, 2^32-1]范围内经过HashMap.hash()之后还是得到自己。题主的例子正好落入
         * 这个范围内。外加load factor正好在此例中让这个HashMap没有hash冲突，这就导
         *  致例中元素正好按大小顺序插入在HashMap的开放式哈希表里。
         *
         *  我觉得有必要来厘清一下我们说的 有序 和 无序 到底指的是什么。有序和无序的概念远不是字面上看的这样简单。
         *
         *  举个栗子，List是有序的？还是无序的？
         *
         *  通常情况下，我们说一个列表是有序的，是指：
         *  这个列表严格按照指定的偏序关系（Comparable接口等定义）存放或检索元素。
         *
         *  我们说一个列表是无序的，是指：
         *  这个列表存放或检索元素的顺序是不确定的。
         *
         *  根据这两个定义，我们可以得到第三种情况，也就是List这种：
         *  他既不是有序的，因为存放或检索元素不按照指定的偏序关系。
         *  他也不是无序的，因为这个列表存放或检索元素的顺序是确定的。
         *  所以实质上，一般语境中的有序无序并不是反义词，无序不等价于非有序。
         *
         *
         *  更重要的，有序是一个保证，不是结果。
         *  我们按照某个顺序往List里面塞元素，我们检索List的时候，自然看起来是有序的，
         *  我们能说List是一个有序列表吗？不能，因为在我们的语境中，有序列表是指，其检
         *  索的顺序严格遵循偏序关系，与你存放的顺序无关。
         */
    }
}
