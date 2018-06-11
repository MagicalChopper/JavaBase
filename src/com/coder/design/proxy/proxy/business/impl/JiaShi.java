package com.coder.design.proxy.proxy.business.impl;

import com.coder.design.proxy.proxy.business.KindWomen;

public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼...");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏嘿嘿嘿...");
    }
}
