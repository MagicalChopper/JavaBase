package com.coder.design.proxy.executor;

import com.coder.design.proxy.proxy.business.impl.JiaShi;
import com.coder.design.proxy.proxy.WangPo;

/**
 * 大色鬼
 */
public class XiMenQing {
    public static void main(String[] args) {//大色鬼要做事情了，表面上看着是王婆，实际上是潘金莲，王婆的话西门庆才不干
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        WangPo wangPo1 = new WangPo(new JiaShi());
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
