package com.jartein.switchboard.apilib.motherboard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by JohnnyLeung on 2017/1/29.
 */
@WebServlet("/core/queryinfo")
public class QueryInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String retxml="QueryInfo测试页面";
        resp.getOutputStream().write(retxml.getBytes("UTF-8"));
        resp.setContentType("text/xml; charset=UTF-8");
    }
}
