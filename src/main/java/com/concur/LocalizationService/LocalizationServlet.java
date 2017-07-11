package com.concur.LocalizationService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class LocalizationServlet implements ServletContextListener
{
    static String message;

    public void contextInitialized(ServletContextEvent var1)
    {
        File source = new File(var1.getServletContext().getRealPath("/WEB-INF/classes/Expense.xml").toString());
        parse(source);
    }

    public void contextDestroyed(ServletContextEvent var1)
    {

    }

    public void parse(File xmlFile)
    {
        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            LocalizationHandler handler = new LocalizationHandler();
            saxParser.parse(xmlFile, handler);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
