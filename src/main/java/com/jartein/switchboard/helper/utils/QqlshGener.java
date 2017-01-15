package com.jartein.switchboard.helper.utils;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JohnnyLeung on 2017/1/16.
 */
public class QqlshGener {
    static Logger log=Logger.getLogger(QqlshGener.class);
    static int genlens=17;
    public static String getqqlsh(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String formatStr =formatter.format(new Date());
        log.info("Gener init lens is:"+genlens);
        String qqlsh=formatStr.substring(0,genlens);
        log.info("QQLSH is:"+qqlsh);
        return qqlsh;
    }

    public static String getqqlsh(String lshcode,int lensum){
        log.info("Gener init lens is:"+lensum);
        String qqlsh=lshcode.substring(0,lensum);
        log.info("QQLSH is:"+qqlsh);
        return qqlsh;
    }
}
