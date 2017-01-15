package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("Fpsj")
public class FPsj {
    private FP Fp;

    public FP getFp() {
        return Fp;
    }

    public void setFp(FP fp) {
        Fp = fp;
    }
}
