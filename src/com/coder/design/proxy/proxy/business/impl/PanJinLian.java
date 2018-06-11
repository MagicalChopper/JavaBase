package com.coder.design.proxy.proxy.business.impl;

import com.coder.design.proxy.proxy.business.KindWomen;

/**
 * 潘金莲是个什么样的女人
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在和男人happy");
    }
}
