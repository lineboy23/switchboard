package com.jartein.switchboard.beans.global;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
@XStreamAlias("COMP")
public class Comp {
    @XStreamAlias("NSRMC")
    private String nsrmc;
    @XStreamAlias("NSRSBH")
    private String nsrsbh;

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
}
