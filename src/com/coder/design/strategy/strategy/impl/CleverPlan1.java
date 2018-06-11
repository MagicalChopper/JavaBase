package com.coder.design.strategy.strategy.impl;

import com.coder.design.strategy.strategy.IStrategy;

public class CleverPlan1 implements IStrategy {


    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施压");
    }
}
