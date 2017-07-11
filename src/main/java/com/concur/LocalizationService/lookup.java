package com.concur.LocalizationService;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("/lookup/key/{key}/lang/{lang}")
public class lookup
{
    @GET
    @Produces("application/json")
    //http://localhost:8080/LocalizationService/translation/key/foo/lang/de
    public String lookupString(@PathParam("key") String key, @PathParam("lang") String lang)
    {
        return "{\"value\":\"" + LocalizationHandler.getValue(key) + "\"}";
    }
}