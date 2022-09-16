package uz.example;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("/room")
public class RoomResource {
    @Inject
    RoomService roomService;

    @GET
    public List<Room> getRooms() {
        return roomService.getRooms();
    }
}
