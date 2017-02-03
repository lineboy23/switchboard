package com.jartein.switchboard.helper.utils;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by JohnnyLeung on 2017/1/16.
 */
public class QqlshGener {
    static Logger log=Logger.getLogger(QqlshGener.class);
    static int genlens=17;
    public static String getqqlsh(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String qqlsh="X"+getdatetimestr()+chars.charAt((int)(Math.random() * 26));
        log.info("QQLSH is:"+qqlsh);
        return qqlsh;
    }

    public static String getdatetimestr(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String formatStr =formatter.format(new Date());
        return formatStr;
    }

    public static String getqqlsh(String lshcode,int lensum){
        log.info("Gener init lens is:"+lensum);
        String qqlsh=lshcode.substring(0,lensum);
        log.info("QQLSH is:"+qqlsh);
        return qqlsh;
    }

}
