package com.coder.design.strategy.executor;

import com.coder.design.strategy.strategy.impl.CleverPlan1;
import com.coder.design.strategy.strategy.impl.CleverPlan2;
import com.coder.design.strategy.strategy.impl.CleverPlan3;
import com.coder.design.strategy.strategy.context.Context;

public class ZhaoYun {
    public static void main(String[] args) {
        Context context ;
        System.out.println("拆开第一个");
        context = new Context(new CleverPlan1());
        context.operate();
        System.out.println("拆开第二个");
        context = new Context(new CleverPlan2());
        context.operate();
        System.out.println("拆开第三个");
        context = new Context(new CleverPlan3());
        context.operate();
    }
}
