package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by JohnnyLeung on 2017/1/11.
 */
@XStreamAlias("business")
public class Business_r {
    @XStreamAlias("RESPONSE_COMMON_FPKJ")
    private Response_common_fpkj response_common_fpkj;

    public Response_common_fpkj getResponse_common_fpkj() {
        return response_common_fpkj;
    }

    public void setResponse_common_fpkj(Response_common_fpkj response_common_fpkj) {
        this.response_common_fpkj = response_common_fpkj;
    }
}
