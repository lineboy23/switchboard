package com.jartein.switchboard.helper.utils;

/**
 * Created by JohnnyLeung on 2017/1/30.
 */
public class StaticReturnCode {
    //发票类型代码
    public static final String PPDZFP="00XX0200";  //普票电子发票
    public static final String PPZZFP="00XX0100";  //普票纸质发票
    public static final String ZPZZFP="00AA0100";  //专票纸质发票
    public static final String HCPPDZFP="00XX0202";  //红充普票电子发票
    public static final String HCPPZZFP="00XX0102";  //红充普票纸质发票
    public static final String HCZPZZFP="00AA0102";  //红充专票纸质发票
    public static final String ZFPPDZFP="00XX0203";  //作废普票电子发票
    public static final String ZFPPZZFP="00XX0103";  //作废普票纸质发票
    public static final String ZFZPZZFP="00AA0103";  //作废专票纸质发票

    public static final String SUCCESS="000000";    //成功
    public static final String ERRORFIL="999999";   //未知失败
    public static final String FPJEBF="000101";    //发票金额不符错误
    public static final String FPSEBF="000102";    //发票税额不符错误
    public static final String FPJSBF="000103";    //发票价税不符错误
    public static final String LXZHCW="000901";    //数据类型转换错误
}
