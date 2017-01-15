package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("business")
public class Business {
    private Request_common_fpkj REQUEST_COMMON_FPKJ;

    public Request_common_fpkj getREQUEST_COMMON_FPKJ() {
        return REQUEST_COMMON_FPKJ;
    }

    public void setREQUEST_COMMON_FPKJ(Request_common_fpkj REQUEST_COMMON_FPKJ) {
        this.REQUEST_COMMON_FPKJ = REQUEST_COMMON_FPKJ;
    }
}
