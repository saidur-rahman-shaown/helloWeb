package com.peytosoft.helloweb;

import jakarta.servlet.http.*;
import java.io.*;

public class squareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out = res.getWriter();
        out.println("Hellow to Square");
    }
}
