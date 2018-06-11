package com.coder.design.proxy.proxy;

import com.coder.design.proxy.proxy.business.KindWomen;
import com.coder.design.proxy.proxy.business.impl.PanJinLian;

/**
 * 王婆的智慧
 * 王婆老婆子，又老又丑没人看得上她，但她有智慧有经验啊，她可以做为一类女人的代理人
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo(){
        this.kindWomen = new PanJinLian();//默认是潘金莲的代理
    }

    public WangPo(KindWomen kindWomen){//可以作为任何一个KindWomen类型女人的代理
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}
