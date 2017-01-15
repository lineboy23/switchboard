package com.jartein.switchboard.helper.utils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by JohnnyLeung on 2017/1/16.
 */
public class CharsetFilter implements Filter {
    private static String encoding;
    private static final String DEFAULT_CHARSET="UTF-8";
    @Override
    public void destroy() {
        System.out.println("--------destroy---------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("--------doFilter---------");
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse=(HttpServletResponse)response;
        if("GET".equals(httpRequest.getMethod())||"POST".equals(httpRequest.getMethod())){
            EncodingHttpServletRequest wrapper = new EncodingHttpServletRequest(httpRequest, encoding);
            chain.doFilter(wrapper, response);
        }else{
            httpRequest.setCharacterEncoding(encoding);
            httpResponse.setContentType("text/html;charset="+encoding);
            chain.doFilter(request, response);
        }
    }
    private static class  EncodingHttpServletRequest extends HttpServletRequestWrapper {
        private HttpServletRequest request;
        public EncodingHttpServletRequest(HttpServletRequest request,String encoding) {
            super(request);
            this.request = request;
        }
        @Override
        public String getParameter(String name) {
            String value = request.getParameter(name);
            try {
                value = new String(value.getBytes("iso8859-1"), encoding);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
//            return super.getParameter(name);
            return value;
        }
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("--------init---------");
        encoding = config.getInitParameter("encoding");
        if(encoding==null||"".equals(encoding))
            encoding=DEFAULT_CHARSET;
    }
}
