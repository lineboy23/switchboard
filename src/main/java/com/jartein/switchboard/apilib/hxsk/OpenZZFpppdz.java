package com.jartein.switchboard.apilib.hxsk;

import com.google.gson.Gson;
import com.jartein.switchboard.beans.gson.FpkjBean;
import com.jartein.switchboard.beans.gson.SpBean;
import com.jartein.switchboard.beans.xml.*;
import com.jartein.switchboard.helper.Vif;
import com.jartein.switchboard.helper.utils.QqlshGener;
import com.jartein.switchboard.helper.xml.Xmloper;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by JohnnyLeung on 2017/1/10.
 */
@WebServlet("/tax/openzzppdz")
public class OpenZZFpppdz extends HttpServlet {
    Logger log=Logger.getLogger(OpenZZFpppdz.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("utf-8");
        //Map<String, String[]> params = req.getParameterMap();
        String s=req.getParameter("kp");
        log.info(s);
        Gson g=new Gson();
        FpkjBean fb= g.fromJson(s, FpkjBean.class);
        System.out.println(fb.getNsrmc());
        String qqlsh= QqlshGener.getqqlsh();
        log.info("YWQQLSH is:"+qqlsh);

        //发票主体信息制作
        Common_fpkj_fpt cff=new Common_fpkj_fpt();
        cff.setFPQQLSH(qqlsh);//后期对接相关的流水号处理系统,已对接
        cff.setKPLX("0");//默认
        cff.setYFP_DM("");
        cff.setYFP_HM("");
        cff.setBMB_BBH("1.2");
        cff.setXSF_NSRSBH(fb.getNsrsbh());
        cff.setXSF_MC(fb.getNsrmc());
        cff.setXSF_DZDH(fb.getDzdh());
        cff.setXSF_YHZH(fb.getYhzh());
        cff.setGMF_NSRSBH(fb.getGfnsrsbh());
        cff.setGMF_MC(fb.getGfmc());
        cff.setGMF_DZDH(fb.getGfdzdh());
        cff.setGMF_YHZH(fb.getGfyhzh());
        cff.setKPR(fb.getKpr());//税控盘登录账户
        cff.setSKR(fb.getSkr());//税控盘登录账户
        cff.setFHR(fb.getFhr());//税控盘登录账户
        cff.setBZ(fb.getBz());
        //发票明细
        if(fb.getSps().size()<1);//待处理

        List<Common_fpkj_xmxx> lcfx=new ArrayList<Common_fpkj_xmxx>();
        BigDecimal bjehj=new BigDecimal("0.00");
        BigDecimal bsehj=new BigDecimal("0.00");
        BigDecimal bjshj=new BigDecimal("0.00");
        for(int i=0;i<fb.getSps().size();i++){
            SpBean spst=fb.getSps().get(i);

            //验证金额、税额项目，如果有问题，反馈金额税额项目错误编码:: ERR0000298022780000
            if(!Vif.vifamount(spst.getSlv()))return;
            if(!Vif.vifamount(spst.getDj()))return;
            if(!Vif.vifamount(spst.getSl()))return;
            if(!Vif.vifamount(spst.getJe()))return;
            if(!Vif.vifamount(spst.getSe()))return;
            //待处理

            Common_fpkj_xmxx cfx=new Common_fpkj_xmxx();
            cfx.setFPHXZ("0");
            cfx.setSPBM(spst.getSpbm());
            cfx.setZXBM("");
            cfx.setYHZCBS("0");
            cfx.setZZSTSGL("");
            cfx.setLSLBS("");
            cfx.setSL(spst.getSlv());
            cfx.setXMMC(spst.getSpmc());
            cfx.setGGXH(spst.getGgxh());
            cfx.setDW(spst.getDw());
            cfx.setXMDJ(spst.getDj());
            cfx.setXMSL(spst.getSl());
            cfx.setXMJE(spst.getJe());
            cfx.setSE(spst.getSe());
            bjehj=bjehj.add(new BigDecimal(spst.getJe()));
            bsehj=bsehj.add(new BigDecimal(spst.getSe()));
            bjshj=bjshj.add(new BigDecimal(spst.getJe())).add(new BigDecimal(spst.getSe()));
            lcfx.add(cfx);
        }
        //建立发票集合并完成集合封闭
        cff.setHJJE(bjehj.toString());//根据商品明细进行核对后填写的数字
        cff.setHJSE(bsehj.toString());//根据商品明细进行核对后填写的数字
        cff.setJSHJ(bjshj.toString());//根据商品明细进行核对后填写的数字
        Common_fpkj_xmxxs cfxs=new Common_fpkj_xmxxs();
        cfxs.setCOMMON_FPKJ_XMXX(lcfx);
        //建立总体并且封闭包容
        Business b=new Business();
        Request_common_fpkj rcf=new Request_common_fpkj();
        b.setREQUEST_COMMON_FPKJ(rcf);
        rcf.setCOMMON_FPKJ_FPT(cff);
        rcf.setCOMMON_FPKJ_XMXXS(cfxs);

        String retxml= Xmloper.beantoxml(b,"GBK");

        resp.getOutputStream().write(retxml.getBytes("UTF-8"));
        resp.setContentType("text/xml; charset=UTF-8");

    }
}
