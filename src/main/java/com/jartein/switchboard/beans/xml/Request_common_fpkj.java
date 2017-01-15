package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("REQUEST_COMMON_FPKJ")
public class Request_common_fpkj {
    private Common_fpkj_fpt COMMON_FPKJ_FPT;
    private Common_fpkj_xmxxs COMMON_FPKJ_XMXXS;

    public Common_fpkj_fpt getCOMMON_FPKJ_FPT() {
        return COMMON_FPKJ_FPT;
    }

    public void setCOMMON_FPKJ_FPT(Common_fpkj_fpt COMMON_FPKJ_FPT) {
        this.COMMON_FPKJ_FPT = COMMON_FPKJ_FPT;
    }

    public Common_fpkj_xmxxs getCOMMON_FPKJ_XMXXS() {
        return COMMON_FPKJ_XMXXS;
    }

    public void setCOMMON_FPKJ_XMXXS(Common_fpkj_xmxxs COMMON_FPKJ_XMXXS) {
        this.COMMON_FPKJ_XMXXS = COMMON_FPKJ_XMXXS;
    }
}
