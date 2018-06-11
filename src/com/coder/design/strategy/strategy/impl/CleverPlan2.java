package com.coder.design.strategy.strategy.impl;

import com.coder.design.strategy.strategy.IStrategy;

public class CleverPlan2 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯放行");
    }
}
