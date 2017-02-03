package com.jartein.switchboard.apilib.htxx;

import com.jartein.switchboard.apilib.facepackage.Iopenfp;
import com.jartein.switchboard.beans.gson.FpkjBean;
import com.jartein.switchboard.beans.gson.SpBean;
import com.jartein.switchboard.beans.xml.*;
import com.jartein.switchboard.helper.utils.StaticCodeType;
import com.jartein.switchboard.helper.xml.Xmloper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/29.
 */
public class OpenZYPPdzfp implements Iopenfp {
    private FpkjBean sourbean;
    private String qqlsh;
    private Business business;

    public OpenZYPPdzfp(FpkjBean sourcebean, String lsh, BigDecimal jehj,BigDecimal sehj,BigDecimal jshj){
        sourbean=sourcebean;
        qqlsh=lsh;

        business=new Business();
        Request_common_fpkj request_common_fpkj=new Request_common_fpkj();
        business.setREQUEST_COMMON_FPKJ(request_common_fpkj);
        Common_fpkj_fpt common_fpkj_fpt=new Common_fpkj_fpt();
        common_fpkj_fpt.setFPQQLSH(qqlsh);
        common_fpkj_fpt.setKPLX("0");
        common_fpkj_fpt.setYFP_DM("");
        common_fpkj_fpt.setYFP_HM("");
        common_fpkj_fpt.setBMB_BBH("1.2");
        common_fpkj_fpt.setXSF_NSRSBH(sourcebean.getNsrsbh());
        common_fpkj_fpt.setXSF_MC(sourcebean.getNsrmc());
        common_fpkj_fpt.setXSF_DZDH(sourcebean.getDzdh());
        common_fpkj_fpt.setXSF_YHZH(sourcebean.getYhzh());
        common_fpkj_fpt.setGMF_NSRSBH(sourcebean.getGfnsrsbh());
        common_fpkj_fpt.setGMF_MC(sourcebean.getGfmc());
        common_fpkj_fpt.setGMF_DZDH(sourcebean.getGfdzdh());
        common_fpkj_fpt.setGMF_YHZH(sourcebean.getGfyhzh());
        common_fpkj_fpt.setKPR(sourcebean.getKpr());
        common_fpkj_fpt.setSKR(sourcebean.getSkr());
        common_fpkj_fpt.setFHR(sourcebean.getFhr());
        common_fpkj_fpt.setBZ(sourcebean.getBz());
        common_fpkj_fpt.setHJJE(jehj.toString());
        common_fpkj_fpt.setHJSE(sehj.toString());
        common_fpkj_fpt.setJSHJ(jshj.toString());
        request_common_fpkj.setCOMMON_FPKJ_FPT(common_fpkj_fpt);
        Common_fpkj_xmxxs common_fpkj_xmxxs=new Common_fpkj_xmxxs();
        request_common_fpkj.setCOMMON_FPKJ_XMXXS(common_fpkj_xmxxs);
        List<Common_fpkj_xmxx> lsxmxx=new ArrayList<Common_fpkj_xmxx>();
        for(int i=0;i<sourcebean.getSps().size();i++){
            SpBean sb=sourcebean.getSps().get(i);
            Common_fpkj_xmxx common_fpkj_xmxx=new Common_fpkj_xmxx();
            common_fpkj_xmxx.setFPHXZ("0");
            common_fpkj_xmxx.setSPBM(sb.getSpbm());
            common_fpkj_xmxx.setZXBM("");
            common_fpkj_xmxx.setYHZCBS("0");
            common_fpkj_xmxx.setZZSTSGL("");
            common_fpkj_xmxx.setLSLBS("");
            common_fpkj_xmxx.setSL(sb.getSlv());
            common_fpkj_xmxx.setXMMC(sb.getSpmc());
            common_fpkj_xmxx.setGGXH(sb.getGgxh());
            common_fpkj_xmxx.setDW(sb.getDw());
            common_fpkj_xmxx.setXMDJ(sb.getDj());
            common_fpkj_xmxx.setXMSL(sb.getSl());
            common_fpkj_xmxx.setXMJE(sb.getJe());
            common_fpkj_xmxx.setSE(sb.getSe());
            lsxmxx.add(common_fpkj_xmxx);
        }

        common_fpkj_xmxxs.setCOMMON_FPKJ_XMXX(lsxmxx);
    }

    @Override
    public String toString() {
        return Xmloper.beantoxml(business, StaticCodeType.GBK);
    }
}
