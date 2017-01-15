package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/11.
 */
@XStreamAlias("RESPONSE_COMMON_FPKJ")
public class Response_common_fpkj {
    @XStreamAlias("FPQQLSH")
    private String fpqqlsh;
    @XStreamAlias("JQBH")
    private String jqbm;
    @XStreamAlias("FP_DM")
    private String fp_dm;
    @XStreamAlias("FP_HM")
    private String fp_hm;
    @XStreamAlias("KPRQ")
    private String kprq;
    @XStreamAlias("FP_MW")
    private String fp_mw;
    @XStreamAlias("JYM")
    private String jym;
    @XStreamAlias("EWM")
    private String ewm;
    @XStreamAlias("BZ")
    private String bz;
    @XStreamAlias("RETURNCODE")
    private String returncode;
    @XStreamAlias("RETURNMSG")
    private String returnmsg;

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh;
    }

    public String getJqbm() {
        return jqbm;
    }

    public void setJqbm(String jqbm) {
        this.jqbm = jqbm;
    }

    public String getFp_dm() {
        return fp_dm;
    }

    public void setFp_dm(String fp_dm) {
        this.fp_dm = fp_dm;
    }

    public String getFp_hm() {
        return fp_hm;
    }

    public void setFp_hm(String fp_hm) {
        this.fp_hm = fp_hm;
    }

    public String getKprq() {
        return kprq;
    }

    public void setKprq(String kprq) {
        this.kprq = kprq;
    }

    public String getFp_mw() {
        return fp_mw;
    }

    public void setFp_mw(String fp_mw) {
        this.fp_mw = fp_mw;
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym;
    }

    public String getEwm() {
        return ewm;
    }

    public void setEwm(String ewm) {
        this.ewm = ewm;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getReturncode() {
        return returncode;
    }

    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    public String getReturnmsg() {
        return returnmsg;
    }

    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }
}
