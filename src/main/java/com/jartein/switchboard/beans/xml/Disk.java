package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("disk")
public class Disk {
    private String nsrmc;
    private String nsrsbh;
    private String dzdh;
    private String yhzh;

    public Disk(){
        super();
    }

    public Disk(String nsrmc,String nsrsbh,String dzdh,String yhzh){
        super();
        this.nsrmc=nsrmc;
        this.nsrsbh=nsrsbh;
        this.dzdh=dzdh;
        this.yhzh=yhzh;
    }

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

    public String getDzdh() {
        return dzdh;
    }
    public void setDzdh(String dzdh) {
        this.dzdh = dzdh;
    }

    public String getYhzh() {
        return yhzh;
    }
    public void setYhzh(String yhzh) {
        this.yhzh = yhzh;
    }
}
