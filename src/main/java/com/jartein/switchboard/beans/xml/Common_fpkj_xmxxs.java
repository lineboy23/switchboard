package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("COMMON_FPKJ_XMXXS")
public class Common_fpkj_xmxxs {
    @XStreamImplicit(itemFieldName="COMMON_FPKJ_XMXX")//标注加在list上
    private List<Common_fpkj_xmxx> COMMON_FPKJ_XMXX;

    public List<Common_fpkj_xmxx> getCOMMON_FPKJ_XMXX() {
        return COMMON_FPKJ_XMXX;
    }

    public void setCOMMON_FPKJ_XMXX(List<Common_fpkj_xmxx> COMMON_FPKJ_XMXX) {
        this.COMMON_FPKJ_XMXX = COMMON_FPKJ_XMXX;
    }
}
