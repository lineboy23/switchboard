package com.jartein.switchboard.beans.gson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
public class FpkjBean implements Serializable {
    private String type;
    private String nsrmc;
    private String nsrsbh;
    private String dzdh;
    private String yhzh;
    private String gfnsrsbh;
    private String gfmc;
    private String gfdzdh;
    private String gfyhzh;
    private String bz;
    private String kpr;
    private String skr;
    private String fhr;
    private List<SpBean> sps;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public List<SpBean> getSps() {
        return sps;
    }

    public String getGfnsrsbh() {
        return gfnsrsbh;
    }

    public void setGfnsrsbh(String gfnsrsbh) {
        this.gfnsrsbh = gfnsrsbh;
    }

    public String getGfdzdh() {
        return gfdzdh;
    }

    public void setGfdzdh(String gfdzdh) {
        this.gfdzdh = gfdzdh;
    }

    public String getGfyhzh() {
        return gfyhzh;
    }

    public void setGfyhzh(String gfyhzh) {
        this.gfyhzh = gfyhzh;
    }

    public String getGfmc() {
        return gfmc;
    }

    public void setGfmc(String gfmc) {
        this.gfmc = gfmc;
    }

    public void setSps(List<SpBean> sps) {
        this.sps = sps;
    }

    public String getKpr() {
        return kpr;
    }

    public void setKpr(String kpr) {
        this.kpr = kpr;
    }

    public String getSkr() {
        return skr;
    }

    public void setSkr(String skr) {
        this.skr = skr;
    }

    public String getFhr() {
        return fhr;
    }

    public void setFhr(String fhr) {
        this.fhr = fhr;
    }
}
