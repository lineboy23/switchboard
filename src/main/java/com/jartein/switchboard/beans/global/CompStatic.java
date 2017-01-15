package com.jartein.switchboard.beans.global;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
public class CompStatic {
    private static String nsrmc;
    private static String nsrsbh;

    public static void copyComp(Comp c){
        nsrmc=c.getNsrmc();
        nsrsbh=c.getNsrsbh();
    }

    public static String getNsrmc() {
        return nsrmc;
    }

    public static void setNsrmc(String nsrmc) {
        CompStatic.nsrmc = nsrmc;
    }

    public static String getNsrsbh() {
        return nsrsbh;
    }

    public static void setNsrsbh(String nsrsbh) {
        CompStatic.nsrsbh = nsrsbh;
    }
}
