package com.coder.design.strategy.strategy.impl;

import com.coder.design.strategy.strategy.IStrategy;

public class CleverPlan3 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后");
    }
}
