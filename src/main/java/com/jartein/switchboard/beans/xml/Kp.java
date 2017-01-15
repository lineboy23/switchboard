package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("Kp")
public class Kp {
    private String Version;
    private FPxx Fpxx;

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public FPxx getFpxx() {
        return Fpxx;
    }

    public void setFpxx(FPxx fpxx) {
        Fpxx = fpxx;
    }
}
