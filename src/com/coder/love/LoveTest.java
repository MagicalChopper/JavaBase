package com.coder.love;

public class LoveTest {
    public static void main(String[] args) {
        Person me = new Person("lh",true,true);
        Person you = new Person("zh",true,true);
        if(you.love(me)||!you.love(me)){
            int love = me.love;love++;love--;
            System.out.println(you.love(me));
        }
    }
}
