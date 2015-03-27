package com.testWeb;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.io.IOException;

/**
 * Created by shychka on 3/26/2015.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Service
@Path("/spring")
public class MyRestfulService {
    // The Java method will process HTTP GET requests

    @GET
    @Path("/{id}")
    @Produces("text/html")
    public void getClichedMessage( @PathParam("id") String id, @Context HttpServletResponse servletResponse) throws IOException {
        System.out.println("ADSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + id);

        servletResponse.sendRedirect("../../index.html");
    }
}
