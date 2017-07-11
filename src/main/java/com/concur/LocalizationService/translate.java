package com.concur.LocalizationService;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("/translation/key/{key}/lang/{lang}")
public class translate
{
    @GET
    @Produces("application/json")
    public String lookupString(@PathParam("key") String key, @PathParam("lang") String lang, @Context HttpServletRequest request)
    {
        return LocalizationHandler.getValue(key);
    }
}