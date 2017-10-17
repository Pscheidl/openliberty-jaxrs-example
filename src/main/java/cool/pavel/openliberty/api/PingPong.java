package cool.pavel.openliberty.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/ping")
public class PingPong {

    @GET
    public Response ping() {
        return Response.ok("Pong")
                .build();
    }
}
