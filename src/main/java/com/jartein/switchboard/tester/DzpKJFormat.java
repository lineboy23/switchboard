package com.jartein.switchboard.tester;

import com.jartein.switchboard.beans.xml.*;
import com.jartein.switchboard.helper.xml.Xmloper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/10.
 * Post Method
 */
@WebServlet("/test/dzpkj")
public class DzpKJFormat extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Business business=new Business();
        Request_common_fpkj request_common_fpkj=new Request_common_fpkj();
        business.setREQUEST_COMMON_FPKJ(request_common_fpkj);
        Common_fpkj_fpt common_fpkj_fpt=new Common_fpkj_fpt();
        common_fpkj_fpt.setFPQQLSH("10000001234567");
        common_fpkj_fpt.setKPLX("0");
        common_fpkj_fpt.setYFP_DM("");
        common_fpkj_fpt.setYFP_HM("");
        common_fpkj_fpt.setBMB_BBH("1.2");
        common_fpkj_fpt.setXSF_NSRSBH("91440300319797090X");
        common_fpkj_fpt.setXSF_MC("北京中税信息网络有限公司深圳分公司");
        common_fpkj_fpt.setXSF_DZDH("深圳市南山区科技园高新南6道16号泰邦科技大厦7楼701A 075583252392");
        common_fpkj_fpt.setXSF_YHZH("江苏银行深圳前海支行");
        common_fpkj_fpt.setGMF_NSRSBH("100200333333");
        common_fpkj_fpt.setGMF_MC("北京中慈创新科技有限公司");
        common_fpkj_fpt.setGMF_DZDH("购买方地址电话123");
        common_fpkj_fpt.setGMF_YHZH("购买方银行账号456");
        common_fpkj_fpt.setKPR("吴志洪");
        common_fpkj_fpt.setSKR("吴志洪");
        common_fpkj_fpt.setFHR("吴志洪");
        common_fpkj_fpt.setBZ("备注789");
        common_fpkj_fpt.setHJJE("20.00");
        common_fpkj_fpt.setHJSE("1.2");
        common_fpkj_fpt.setJSHJ("21.2");
        request_common_fpkj.setCOMMON_FPKJ_FPT(common_fpkj_fpt);
        Common_fpkj_xmxxs common_fpkj_xmxxs=new Common_fpkj_xmxxs();
        request_common_fpkj.setCOMMON_FPKJ_XMXXS(common_fpkj_xmxxs);
        Common_fpkj_xmxx common_fpkj_xmxx=new Common_fpkj_xmxx();
        common_fpkj_xmxx.setFPHXZ("0");
        common_fpkj_xmxx.setSPBM("4010200000000000000");
        common_fpkj_xmxx.setZXBM("");
        common_fpkj_xmxx.setYHZCBS("0");
        common_fpkj_xmxx.setZZSTSGL("");
        common_fpkj_xmxx.setLSLBS("");
        common_fpkj_xmxx.setSL("0.06");
        common_fpkj_xmxx.setXMMC("技术服务");
        common_fpkj_xmxx.setGGXH("test");
        common_fpkj_xmxx.setDW("次");
        common_fpkj_xmxx.setXMDJ("20");
        common_fpkj_xmxx.setXMSL("1");
        common_fpkj_xmxx.setXMJE("20");
        common_fpkj_xmxx.setSE("1.2");
        Common_fpkj_xmxx common_fpkj_xmxx1=new Common_fpkj_xmxx();
        common_fpkj_xmxx1.setFPHXZ("0");
        common_fpkj_xmxx1.setSPBM("4010200000000000000");
        common_fpkj_xmxx1.setZXBM("");
        common_fpkj_xmxx1.setYHZCBS("0");
        common_fpkj_xmxx1.setZZSTSGL("");
        common_fpkj_xmxx1.setLSLBS("");
        common_fpkj_xmxx1.setSL("0.06");
        common_fpkj_xmxx1.setXMMC("技术服务");
        common_fpkj_xmxx1.setGGXH("test");
        common_fpkj_xmxx1.setDW("次");
        common_fpkj_xmxx1.setXMDJ("20");
        common_fpkj_xmxx1.setXMSL("1");
        common_fpkj_xmxx1.setXMJE("20");
        common_fpkj_xmxx1.setSE("1.2");
        List<Common_fpkj_xmxx> lsxmxx=new ArrayList<Common_fpkj_xmxx>();
        lsxmxx.add(common_fpkj_xmxx);
        lsxmxx.add(common_fpkj_xmxx1);
        common_fpkj_xmxxs.setCOMMON_FPKJ_XMXX(lsxmxx);

        Xmloper.beantoxml(business,"GBK");

        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime=dateFormat.format(new Date());
        req.setAttribute("ctime",currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
