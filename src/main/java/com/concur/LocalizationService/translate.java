package com.concur.LocalizationService;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/translation/key/{key}")
public class translate
{
    @GET
    @Produces("application/json")
    public String lookupString(@PathParam("key") String key)
    {
        return "{key:" + key + "}";
    }
}