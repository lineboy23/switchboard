package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("Fpxx")
public class FPxx {
    private String Zsl;
    private FPsj Fpsj;

    public String getZsl() {
        return Zsl;
    }

    public void setZsl(String zsl) {
        Zsl = zsl;
    }

    public FPsj getFpsj() {
        return Fpsj;
    }

    public void setFpsj(FPsj fpsj) {
        Fpsj = fpsj;
    }
}
