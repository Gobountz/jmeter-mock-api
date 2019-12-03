package com.gobountz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/randomTime")
public class RandomTimeResource {

    @GET
    @Path("/{max}")
    public void randomTime(@PathParam("max") Integer maxTimeInMillis) throws InterruptedException {
        Thread.sleep(Double.valueOf(Math.random() * maxTimeInMillis).longValue());
    }
}
