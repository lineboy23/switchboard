package com.jartein.switchboard.beans.global;

import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
public class ConfigXmlStatic {
    private static String biz_dir;
    private static String lib_dir;
    private static String err_dir;

    private static String dz_dir1;
    private static String dz_dir2;
    private static String dz_dir3;

    private static String zz_dir1;
    private static String zz_dir2;
    private static String zz_dir3;

    private static String sys_dir;

    private static List<Comp> lcomp;

    public static void copyConfigXml(ConfigXml cx){
        biz_dir=cx.getBiz_dir();
        lib_dir=cx.getLib_dir();
        err_dir=cx.getErr_dir();

        dz_dir1=cx.getDz_dir1();
        dz_dir2=cx.getDz_dir2();
        dz_dir3=cx.getDz_dir3();

        zz_dir1=cx.getZz_dir1();
        zz_dir2=cx.getZz_dir2();
        zz_dir3=cx.getZz_dir3();

        sys_dir=cx.getSys_dir();

        lcomp=cx.getLcomp();
    }

    public static String getBiz_dir() {
        return biz_dir;
    }

    public static void setBiz_dir(String biz_dir) {
        ConfigXmlStatic.biz_dir = biz_dir;
    }

    public static String getLib_dir() {
        return lib_dir;
    }

    public static void setLib_dir(String lib_dir) {
        ConfigXmlStatic.lib_dir = lib_dir;
    }

    public static String getErr_dir() {
        return err_dir;
    }

    public static void setErr_dir(String err_dir) {
        ConfigXmlStatic.err_dir = err_dir;
    }

    public static String getDz_dir1() {
        return dz_dir1;
    }

    public static void setDz_dir1(String dz_dir1) {
        ConfigXmlStatic.dz_dir1 = dz_dir1;
    }

    public static String getDz_dir2() {
        return dz_dir2;
    }

    public static void setDz_dir2(String dz_dir2) {
        ConfigXmlStatic.dz_dir2 = dz_dir2;
    }

    public static String getDz_dir3() {
        return dz_dir3;
    }

    public static void setDz_dir3(String dz_dir3) {
        ConfigXmlStatic.dz_dir3 = dz_dir3;
    }

    public static String getZz_dir1() {
        return zz_dir1;
    }

    public static void setZz_dir1(String zz_dir1) {
        ConfigXmlStatic.zz_dir1 = zz_dir1;
    }

    public static String getZz_dir2() {
        return zz_dir2;
    }

    public static void setZz_dir2(String zz_dir2) {
        ConfigXmlStatic.zz_dir2 = zz_dir2;
    }

    public static String getZz_dir3() {
        return zz_dir3;
    }

    public static void setZz_dir3(String zz_dir3) {
        ConfigXmlStatic.zz_dir3 = zz_dir3;
    }

    public static List<Comp> getLcomp() {
        return lcomp;
    }

    public static void setLcomp(List<Comp> lcomp) {
        ConfigXmlStatic.lcomp = lcomp;
    }

    public static String getSys_dir() {
        return sys_dir;
    }

    public static void setSys_dir(String sys_dir) {
        ConfigXmlStatic.sys_dir = sys_dir;
    }
}
