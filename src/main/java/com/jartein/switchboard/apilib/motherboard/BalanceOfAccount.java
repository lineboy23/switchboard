package com.jartein.switchboard.apilib.motherboard;

import com.jartein.switchboard.helper.utils.QqlshGener;
import com.jartein.switchboard.helper.utils.StaticContentType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by JohnnyLeung on 2017/1/29.
 */
@WebServlet("/core/boa")
public class BalanceOfAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String retxml="BalanceOfAccount测试页面"+ QqlshGener.getqqlsh();
        resp.getOutputStream().write(retxml.getBytes("UTF-8"));
        resp.setContentType(StaticContentType.JSON);
    }
}
