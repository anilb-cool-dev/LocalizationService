// Import required java libraries
package com.concur.LocalizationService;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class LocalizationServlet extends HttpServlet
{
    public void init() throws ServletException
    {
        // Do required initialization
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello World</h1>");
    }

    public void destroy()
    {
        // do nothing.
    }
}