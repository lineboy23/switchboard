package com.jartein.switchboard.tester;

import com.google.gson.Gson;
import com.jartein.switchboard.beans.global.Comp;
import com.jartein.switchboard.beans.global.ConfigXml;
import com.jartein.switchboard.beans.gson.FpkjBean;
import com.jartein.switchboard.beans.gson.SpBean;
import com.jartein.switchboard.beans.xml.*;
import com.jartein.switchboard.helper.Vif;
import com.jartein.switchboard.helper.utils.QqlshGener;
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
 * Created by JohnnyLeung on 2016/12/30.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Disk disk = new Disk("北京中慈创新科技有限公司", "3301019821807666", "01058836955","10101010001001");
//        List<Disk> disks=new ArrayList<Disk>();
//        disks.add(disk);
//        Configs configs = new Configs("\\", "\\", "\\","\\","\\","\\","\\", disks);

//        Comp c=new Comp();
//        c.setNsrmc("北京中慈创新科技有限公司");
//        c.setNsrsbh("33010195610062349");
//        ConfigXml cx=new ConfigXml();
//        cx.setBiz_dir("C:/biz/");
//        cx.setLib_dir("C:/lib/");
//        cx.setErr_dir("C:/err/");
//        cx.setDz_dir1("C:/dz_dir1/");
//        cx.setDz_dir2("C:/dz_dir2/");
//        cx.setDz_dir3("C:/dz_dir3/");
//        cx.setZz_dir1("C:/zz_dir1/");
//        cx.setZz_dir2("C:/zz_dir2/");
//        cx.setZz_dir3("C:/zz_dir3/");
//        List<Comp> lc=new ArrayList<Comp>();
//        lc.add(c);
//        cx.setLcomp(lc);
//
//        String xml=Xmloper.beantoxml(cx,"UTF-8");
//
//        System.out.println(xml);
        Vif.vifamount("12.333");

        SpBean sb=new SpBean();
        sb.setDj("dj");
        sb.setDw("dw");
        sb.setGgxh("ggxh");
        sb.setJe("je");
        sb.setSe("se");
        sb.setSl("sl");
        sb.setSlv("slv");
        sb.setSpmc("spmc");
        FpkjBean fb=new FpkjBean();
        fb.setBz("bz");
        fb.setDzdh("dzzh");
        fb.setYhzh("yhdh");
        fb.setNsrmc("nsrmc");
        fb.setNsrsbh("nsrsbh");
        List<SpBean> lsb=new ArrayList<SpBean>();
        lsb.add(sb);
        fb.setSps(lsb);
        fb.setType("type");

        Gson g=new Gson();
        String tj=g.toJson(fb);
        System.out.println(tj);
        FpkjBean fbr=g.fromJson(tj,FpkjBean.class);
        System.out.println(fbr.getNsrmc());

        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime=dateFormat.format(new Date());
        req.setAttribute("ctime",currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
