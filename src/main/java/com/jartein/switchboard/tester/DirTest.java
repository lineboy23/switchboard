package com.jartein.switchboard.tester;

import com.jartein.switchboard.helper.fileio.FileHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by JohnnyLeung on 2017/1/12.
 */
@WebServlet("/test/dir")
public class DirTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileHelper.createandwritexmlfile("C:/test/","helloxml","what`s up hurry?");
    }

}
