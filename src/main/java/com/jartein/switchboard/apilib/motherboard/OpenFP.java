package com.jartein.switchboard.apilib.motherboard;

import com.google.gson.Gson;
import com.jartein.switchboard.apilib.facepackage.Iopenfp;
import com.jartein.switchboard.apilib.htxx.*;
import com.jartein.switchboard.beans.global.ConfigXmlStatic;
import com.jartein.switchboard.beans.gson.FpkjBean;
import com.jartein.switchboard.beans.gson.RetInfo1;
import com.jartein.switchboard.beans.gson.SpBean;
import com.jartein.switchboard.helper.utils.QqlshGener;
import com.jartein.switchboard.helper.utils.StaticContentType;
import com.jartein.switchboard.helper.utils.StaticReturnCode;
import com.jartein.switchboard.helper.xml.Xmloper;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static com.jartein.switchboard.helper.utils.StaticReturnCode.*;

/**
 * Created by JohnnyLeung on 2017/1/29.
 */
@WebServlet("/core/openfp")
public class OpenFP extends HttpServlet {
    Logger log=Logger.getLogger(OpenFP.class);

    String retcode= StaticReturnCode.SUCCESS;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取开票信息参数
        String skey=req.getParameter("key");
        String kpinfo=req.getParameter("kpinfo");
        log.info("获取开票请求："+kpinfo);
        String bizcode= QqlshGener.getqqlsh();
        log.info("获取请求流水号："+bizcode);
        //解析开票请求数据
        Gson g=new Gson();
        FpkjBean fb= g.fromJson(kpinfo, FpkjBean.class);
        log.info("请求标题类型："+fb.getType());

        //验证票据金额、税额、合计、日期等数据合法性
        List<SpBean> lsb= fb.getSps();
        BigDecimal jehj=new BigDecimal("0.00");
        BigDecimal sehj=new BigDecimal("0.00");
        BigDecimal jshj=new BigDecimal("0.00");
        for(int i=0;i<lsb.size();i++){
            try {
                jehj = jehj.add(new BigDecimal(lsb.get(i).getJe()));
                sehj = sehj.add(new BigDecimal(lsb.get(i).getSe()));
                jshj = jshj.add(new BigDecimal(lsb.get(i).getJe()).add(new BigDecimal(lsb.get(i).getSe())));
                BigDecimal tjshj=new BigDecimal(lsb.get(i).getJe()).add(new BigDecimal(lsb.get(i).getSe()));
                BigDecimal js_vif = new BigDecimal(lsb.get(i).getDj()).multiply(new BigDecimal(lsb.get(i).getSl()));
                BigDecimal se_vif = js_vif.multiply(new BigDecimal(lsb.get(i).getSlv()));

                if(!(js_vif.doubleValue()==new BigDecimal(lsb.get(i).getJe()).doubleValue())){
                    retcode=StaticReturnCode.FPJEBF;
                }
                if(!(se_vif.doubleValue()==new BigDecimal(lsb.get(i).getSe()).doubleValue())){
                    retcode=StaticReturnCode.FPSEBF;
                }
                if(!(tjshj.doubleValue()==js_vif.add(se_vif).doubleValue())){
                    retcode=StaticReturnCode.FPJSBF;
                }

            }catch (NumberFormatException nfe){
                log.error("NumberFormatException:JE/SE/SL/DJ/SLV");
            }
        }

        if(retcode.equals(StaticReturnCode.SUCCESS)) {
            //根据类型制造生成相关的XML文件
            Iopenfp iof = null;
            switch (fb.getType()) {
                case PPDZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new OpenZYPPdzfp(fb, bizcode, jehj, sehj, jshj);
                    break;
                case PPZZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new OpenZYPPzzfp();
                    break;
                case ZPZZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new OpenZYZPzzfp();
                    break;
                case HCPPDZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new RedZYPPdzfp();
                    break;
                case HCPPZZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new RedZYPPzzfp();
                    break;
                case HCZPZZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new RedZYZPzzfp();
                    break;
                case ZFPPDZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new ZfZYPPdzfp();
                    break;
                case ZFPPZZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new ZfZYPPzzfp();
                    break;
                case ZFZPZZFP:
                    //TODO 这里在下面版本需要升级改造成支持航信百旺判断的接口
                    iof = new ZfZYZPzzfp();
                    break;
            }

            //生成开票信息报文并存储到制定任务位置，文件名为开票信息流水号
            String filecontent = iof.toString();
            log.info("获取开票文档：\r" + iof.toString());
            Xmloper.out(filecontent, ConfigXmlStatic.getDz_dir1(), bizcode);
        }

        //反馈开票处理流水号
        RetInfo1 ri=new RetInfo1();
        ri.setBizdate(QqlshGener.getdatetimestr());
        ri.setBizcode(bizcode);
        ri.setRetcode(retcode);
        String retjson=g.toJson(ri);

        resp.getOutputStream().write(retjson.getBytes("UTF-8"));
        resp.setContentType(StaticContentType.JSON);
    }
}
