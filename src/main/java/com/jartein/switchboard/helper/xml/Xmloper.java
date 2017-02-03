package com.jartein.switchboard.helper.xml;


import com.jartein.switchboard.beans.global.Comp;
import com.jartein.switchboard.beans.global.ConfigXml;
import com.jartein.switchboard.beans.global.ConfigXmlStatic;
import com.jartein.switchboard.beans.xml.Business;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Object;

/**
 * Created by JohnnyLeung on 2017/1/3.
 */
public class Xmloper {
    static Logger log = Logger.getLogger(Xmloper.class);
    public static String beantoxml(Object obj,String encoding){
        //PropertyConfigurator.configure("/log4j.properties");
        //将java对象转换为XML字符串
        XStream xStream = new XStream(new DomDriver(null,new XmlFriendlyNameCoder("_-", "_")));
        xStream.autodetectAnnotations(true);
        String xml = xStream.toXML(obj);//转化Object到XML
        xml = "<?xml version=\"1.0\" encoding=\""+encoding+"\"?>\n"    + xml;

        log.info(xml);
        return xml;
    }

    public static Object xmltobean(String xml){
        XStream xStream = new XStream(new DomDriver(null,new XmlFriendlyNameCoder("_-", "_")));
        //xStream.autodetectAnnotations(true);
        xStream.processAnnotations(ConfigXml.class);
        xStream.processAnnotations(Comp.class);
        xStream.processAnnotations(Business.class);

        Object xmlc = xStream.fromXML(xml);//转化Object到XML
        return xmlc;
    }


    public static String out(String content,String path,String filename) throws IOException {
        File file=new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        FileWriter fw=new FileWriter(path+filename+".xml");
        fw.write(content);
        fw.flush();
        fw.close();
;        return "";
    }

    public static String[] in(String path,String filename){
        return new String[2];
    }
}
