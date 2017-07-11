package com.concur.LocalizationService;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.HashMap;

public class LocalizationHandler extends DefaultHandler
{
    boolean userMessage = false;
    String id;
    String value;
    static HashMap map = new HashMap();

    @Override
    public void startElement(String uri,
                             String localName, String qName, Attributes attributes)
            throws SAXException
    {
        if (qName.equalsIgnoreCase("UserMessage"))
        {
            userMessage = true;
            id = attributes.getValue("ID");
        }
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException
    {
        if (qName.equalsIgnoreCase("UserMessage"))
        {
            userMessage = false;
            map.put(id, value);
        }
    }

    @Override
    public void characters(char ch[],
                           int start, int length) throws SAXException
    {
        if (userMessage)
        {
            value = new String(ch, start, length);
        }
    }

    public static String getValue(String key)
    {
        if (map != null)
        {
            String value = (String)map.get(key);
            return value != null ? value : "";
        }
        else
        {
            return "";
        }
    }
}
