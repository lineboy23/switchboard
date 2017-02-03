package com.jartein.switchboard.beans.gson;

import java.io.Serializable;

/**
 * Created by JohnnyLeung on 2017/2/3.
 */
public class RetInfo1 implements Serializable {
    private String retcode="000000";
    private String retmsg="";
    private String bizcode="";
    private String bizdate="";
    private String memo="";

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public String getBizcode() {
        return bizcode;
    }

    public void setBizcode(String bizcode) {
        this.bizcode = bizcode;
    }

    public String getBizdate() {
        return bizdate;
    }

    public void setBizdate(String bizdate) {
        this.bizdate = bizdate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
