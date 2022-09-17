package uz.example;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Produces(MediaType.APPLICATION_JSON)
@Path("/room")
public class RoomResource {

    @Inject
    RoomService roomService;

    @Inject
    MeterRegistry meterRegistry;

    @GET
    public List<Room> getRooms() {
        Timer timer = Timer.builder("roomservice").tag("method", "getRooms").register(meterRegistry);
        timer.record(10, TimeUnit.MICROSECONDS);
        return roomService.getRooms();
    }
}
