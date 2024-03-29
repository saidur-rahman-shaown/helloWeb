package com.peytosoft.helloweb;
import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/subtract")
public class subtractServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        int i = Integer.parseInt(req.getParameter("number1"));
        int j = Integer.parseInt(req.getParameter("number2"));
        int k = i-j;

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<form action=\"submit\" method=\"get\">\n" +
                "    <label for=\"number1\">Number 1:</label><br>\n" +
                "    <input type=\"number\" id=\"number1\" name=\"number1\" value="+i+"><br>\n" +
                "    <label for=\"number2\">Number 2:</label><br>\n" +
                "    <input type=\"number\" id=\"number2\" name=\"number2\" value="+j+"><br><br>\n" +
                "    <input type=\"submit\" value=\"Add\">\n" +
                "</form><br>");
        out.println("<h1> the result is " + k + "</h1>");
        out.println("</body></html>");
//        req.setAttribute("k", k);
//
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        try {
//            rd.forward(req, res);
//        } catch (ServletException e) {
//            throw new RuntimeException(e);
//        }

    }
}
