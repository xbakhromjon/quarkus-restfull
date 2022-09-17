package uz.example;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class RoomService {
    private final static Logger LOG = Logger.getLogger(RoomResource.class);
    public List<Room> getRooms() {
        List<Room> rooms = List.of(new Room("r1", "r1", "r"),
                new Room("r2", "r2", "r"),
                new Room("r3", "r3", "r"));
        LOG.debugf("exiting getRooms");
        return rooms;
    }
}
