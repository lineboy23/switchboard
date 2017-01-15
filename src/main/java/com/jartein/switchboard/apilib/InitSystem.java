package com.jartein.switchboard.apilib;

import com.jartein.switchboard.beans.global.ConfigXml;
import com.jartein.switchboard.beans.global.ConfigXmlStatic;
import com.jartein.switchboard.helper.fileio.FileHelper;
import com.jartein.switchboard.helper.xml.Xmloper;
import org.apache.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.File;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
@WebServlet("/sys/init")
public class InitSystem extends HttpServlet {
    static  Logger log=Logger.getLogger(InitSystem.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.info("========   System Init Info Start   ========");
        initConfigXMLin(this.getServletContext());
        log.info("BizDir Print out:========   "+ConfigXmlStatic.getBiz_dir());
        log.info("LibDir Print out:========   "+ConfigXmlStatic.getLib_dir());
        log.info("ErrDir Print out:========   "+ConfigXmlStatic.getErr_dir());
        log.info("DzDir1 Print out:========   "+ConfigXmlStatic.getDz_dir1());
        log.info("DzDir2 Print out:========   "+ConfigXmlStatic.getDz_dir2());
        log.info("DzDir3 Print out:========   "+ConfigXmlStatic.getDz_dir3());
        log.info("BizDir Print out:========   "+ConfigXmlStatic.getZz_dir1());
        log.info("BizDir Print out:========   "+ConfigXmlStatic.getZz_dir2());
        log.info("BizDir Print out:========   "+ConfigXmlStatic.getZz_dir3());
        ConfigXmlStatic.setSys_dir(this.getServletContext().getRealPath("WEB-INF/"));
        log.info("BizDir Print out:========   "+ConfigXmlStatic.getSys_dir());
        log.info("EnterSum Print out:========   "+ConfigXmlStatic.getLcomp().size());
        log.info("========   Vif Systemconfig File Done!   ========");
        log.info("========   Initialization Must Dir   ========");
        File file=new File(ConfigXmlStatic.getSys_dir()+"\\bizdir");
        if(!file.exists()&&!file.isDirectory()){
            file.mkdir();
            log.info("Initialization bizdir:"+ConfigXmlStatic.getSys_dir()+"\\bizdir");
            ConfigXmlStatic.setBiz_dir(ConfigXmlStatic.getSys_dir()+"\\bizdir");
        }else{
            log.info("========   early have this dir bizdir   ========");
        }
        file=new File(ConfigXmlStatic.getSys_dir()+"\\libdir");
        if(!file.exists()&&!file.isDirectory()){
            file.mkdir();
            log.info("Initialization libdir:"+ConfigXmlStatic.getSys_dir()+"\\libdir");
            ConfigXmlStatic.setBiz_dir(ConfigXmlStatic.getSys_dir()+"\\libdir");
        }else{
            log.info("========   early have this dir libdir   ========");
        }
        file=new File(ConfigXmlStatic.getSys_dir()+"\\errdir");
        if(!file.exists()&&!file.isDirectory()){
            file.mkdir();
            log.info("Initialization bizdir:"+ConfigXmlStatic.getSys_dir()+"\\errdir");
            ConfigXmlStatic.setBiz_dir(ConfigXmlStatic.getSys_dir()+"\\errdir");
        }else{
            log.info("========   early have this dir errdir   ========");
        }

    }

    /**
     * 初始化多服务器更新索引的接口列表
     * 该方法服务器启动时在UpdateIndexListener中被调用
     * */
    public static void initConfigXMLin(ServletContext event) {
        try {
            log.info("Get SysconfigFilePath:========   "+event.getRealPath("WEB-INF/systeminitconfig.xml"));
            String inf=FileHelper.readTxtFile(event.getRealPath("WEB-INF/systeminitconfig.xml"),"UTF-8");
            //log.info(inf);
            ConfigXml cx=(ConfigXml) Xmloper.xmltobean(inf);
            //log.info("========   "+cx.getBiz_dir()+"   ========");
            ConfigXmlStatic.copyConfigXml(cx);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
