package com.jartein.switchboard.tester;

import com.jartein.switchboard.beans.xml.Business_r;
import com.jartein.switchboard.beans.xml.Response_common_fpkj;
import com.jartein.switchboard.helper.xml.Xmloper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JohnnyLeung on 2017/1/11.
 */
@WebServlet("/test/dzpre")
public class DzkpReFormat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Response_common_fpkj response_common_fpkj=new Response_common_fpkj();
        response_common_fpkj.setFpqqlsh("10000001234567");
        response_common_fpkj.setJqbm("661619753581");
        response_common_fpkj.setFp_dm("044031600111");
        response_common_fpkj.setFp_hm("34605196");
        response_common_fpkj.setKprq("20170102230357");
        response_common_fpkj.setFp_mw("920250607557&gt;9&gt;70762&gt;*14146018246/7&gt;&lt;624&lt;/&gt;-65077/4359&gt;-407&lt;-5/683865+&gt;9-4977&lt;3515302037245/732514&lt;1&gt;-+56&lt;&gt;/");
        response_common_fpkj.setJym("55203897502065846223");
        response_common_fpkj.setEwm("");
        response_common_fpkj.setBz("代开企业税号:91440300319797090X 代开企业名称:北京中税信息网络有限公司深圳分公司\n" + "备注789");
        response_common_fpkj.setReturncode("0000");
        response_common_fpkj.setReturnmsg("[2017-01-02 23:03:57] 单据号:10000001234567,开具结果:1,对应发票信息:电子增值税普通发票,044031600111,34605196");

        Business_r business_r=new Business_r();
        business_r.setResponse_common_fpkj(response_common_fpkj);

        String retxml=Xmloper.beantoxml(business_r,"GBK");

        resp.getOutputStream().write(retxml.getBytes("UTF-8"));
        resp.setContentType("text/xml; charset=UTF-8");

//        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String currentTime=dateFormat.format(new Date());
//        req.setAttribute("ctime",currentTime);
//        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
