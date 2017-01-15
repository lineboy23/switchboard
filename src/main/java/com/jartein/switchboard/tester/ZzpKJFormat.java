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
 */
@WebServlet("/test/zzpkj")
public class ZzpKJFormat extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Kp kp=new Kp();
        kp.setVersion("2.0");
        FPxx fPxx=new FPxx();
        kp.setFpxx(fPxx);
        SPh sPh=new SPh();
        sPh.setXh("1");
        sPh.setSpmc("技术服务");
        sPh.setGgxh("520");
        sPh.setJldw("次");
        sPh.setSpbm("4010200000000000000");
        sPh.setQyspbm("企业商品编码");
        sPh.setSyyhzcbz("0");
        sPh.setLslbz("1");
        sPh.setYhzcsm("优惠政策说明");
        sPh.setDj("10");
        sPh.setSl("1");
        sPh.setJe("10");
        sPh.setSlv("0.00");
        sPh.setKce("0.00");
        List<SPh> sph=new ArrayList<SPh>();
        sph.add(sPh);
        FP fp=new FP();
        fp.setDjh("12345678900");
        fp.setGfmc("北京中慈创新科技有限公司");
        fp.setGfsh("1100000000123456");
        fp.setGfyhzh("购方银行账号");
        fp.setGfdzdh("购方地址电话");
        fp.setBz("备注");
        fp.setFhr("吴志洪");
        fp.setSkr("吴志洪");
        fp.setSpbmbbh("4010200000000000000");
        fp.setHsbz("0");
        SPxx spxx=new SPxx();
        spxx.setSph(sph);
        fp.setSpxx(spxx);
        FPsj fPsj=new FPsj();
        fPsj.setFp(fp);
        fPxx.setFpsj(fPsj);
        fPxx.setZsl("1");

        Xmloper.beantoxml(kp,"gb2312");

        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime=dateFormat.format(new Date());
        req.setAttribute("ctime",currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
