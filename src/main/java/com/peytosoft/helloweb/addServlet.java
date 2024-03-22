package com.peytosoft.helloweb;
import java.io.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {


    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        int i = Integer.parseInt(req.getParameter("number1"));
        int j = Integer.parseInt(req.getParameter("number2"));
        int k = i+j;

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1> the result is " + k + "</h1>");
        out.println("</body></html>");
    }
}
