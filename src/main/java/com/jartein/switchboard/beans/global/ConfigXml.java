package com.jartein.switchboard.beans.global;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
@XStreamAlias("CONFIGXML")
public class ConfigXml {
    @XStreamAlias("BIZ_DIR")
    private String biz_dir;
    @XStreamAlias("LIB_DIR")
    private String lib_dir;
    @XStreamAlias("ERR_DIR")
    private String err_dir;

    @XStreamAlias("DZ_DIR1")
    private String dz_dir1;
    @XStreamAlias("DZ_DIR2")
    private String dz_dir2;
    @XStreamAlias("DZ_DIR3")
    private String dz_dir3;

    @XStreamAlias("ZZ_DIR1")
    private String zz_dir1;
    @XStreamAlias("ZZ_DIR2")
    private String zz_dir2;
    @XStreamAlias("ZZ_DIR3")
    private String zz_dir3;

    @XStreamAlias("SYS_DIR")
    private String sys_dir;

    @XStreamAlias("LCOMPS")
    private List<Comp> lcomp;

    public String getBiz_dir() {
        return biz_dir;
    }

    public void setBiz_dir(String biz_dir) {
        this.biz_dir = biz_dir;
    }

    public String getLib_dir() {
        return lib_dir;
    }

    public void setLib_dir(String lib_dir) {
        this.lib_dir = lib_dir;
    }

    public String getErr_dir() {
        return err_dir;
    }

    public void setErr_dir(String err_dir) {
        this.err_dir = err_dir;
    }

    public String getDz_dir1() {
        return dz_dir1;
    }

    public void setDz_dir1(String dz_dir1) {
        this.dz_dir1 = dz_dir1;
    }

    public String getDz_dir2() {
        return dz_dir2;
    }

    public void setDz_dir2(String dz_dir2) {
        this.dz_dir2 = dz_dir2;
    }

    public String getDz_dir3() {
        return dz_dir3;
    }

    public void setDz_dir3(String dz_dir3) {
        this.dz_dir3 = dz_dir3;
    }

    public String getZz_dir1() {
        return zz_dir1;
    }

    public void setZz_dir1(String zz_dir1) {
        this.zz_dir1 = zz_dir1;
    }

    public String getZz_dir2() {
        return zz_dir2;
    }

    public void setZz_dir2(String zz_dir2) {
        this.zz_dir2 = zz_dir2;
    }

    public String getZz_dir3() {
        return zz_dir3;
    }

    public void setZz_dir3(String zz_dir3) {
        this.zz_dir3 = zz_dir3;
    }

    public List<Comp> getLcomp() {
        return lcomp;
    }

    public String getSys_dir() {
        return sys_dir;
    }

    public void setSys_dir(String sys_dir) {
        this.sys_dir = sys_dir;
    }

    public void setLcomp(List<Comp> lcomp) {
        this.lcomp = lcomp;
    }
}
