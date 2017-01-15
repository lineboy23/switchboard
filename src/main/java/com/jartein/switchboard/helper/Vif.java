package com.jartein.switchboard.helper;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

/**
 * Created by JohnnyLeung on 2017/1/16.
 */
public class Vif {
    static Logger log=Logger.getLogger(Vif.class);
    public static boolean vifamount(String amount){
        try {
            BigDecimal bd = new BigDecimal(amount);
            return true;
        }catch (NumberFormatException e){
            log.error("NumberFormatException");
            return false;
        }
    }
}
