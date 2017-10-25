package cool.pavel.openliberty.api;

import com.google.common.collect.ImmutableSet;
import org.apache.commons.lang3.tuple.ImmutablePair;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ping")
public class PingPong {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping() {
        return Response.ok(ImmutableSet.of(ImmutablePair.of("Pong", "Kong"),
                ImmutablePair.of("Dong", "Kong")))
                .build();
    }
}
