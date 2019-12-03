package com.gobountz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/randomError")
public class RandomErrorResource {

    public static final Integer[] ERRORS = new Integer[] {200, 201, 204, 301, 302, 403, 404, 501, 503};

    @GET
    public Response randomError() {
        return Response
                .serverError()
                .status(ERRORS[Double.valueOf(Math.floor(Math.random() * ERRORS.length)).intValue()])
                .build();
    }
}
