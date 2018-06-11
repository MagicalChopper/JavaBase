package com.coder.design.strategy.strategy.context;

import com.coder.design.strategy.strategy.IStrategy;

public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void operate(){
        this.iStrategy.operate();
    }
}
