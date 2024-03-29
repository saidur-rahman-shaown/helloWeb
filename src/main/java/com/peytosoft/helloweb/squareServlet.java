package com.peytosoft.helloweb;

import jakarta.servlet.http.*;
import java.io.*;

public class squareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        int k = (int) req.getAttribute("k");
        PrintWriter out = res.getWriter();
        out.println("Hellow to Square and the output is : "+k*k);
    }
}
