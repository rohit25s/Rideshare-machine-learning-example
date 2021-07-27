package storage;

import model.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {
    private Map<String, Ride> rideMap;

    public RideRepository() {
        this.rideMap = new HashMap<>();
    }

    public void addRide(String id, Ride ride){
        rideMap.put(id, ride);
    }

    public List<Ride> getListOfAvailableRides(String origin, String destination) {
        List<Ride> available = new ArrayList<>();
        for (String key : rideMap.keySet()) {
            Ride ride = rideMap.get(key);
            if (ride.getOrigin().equals(origin) && ride.getDestination().equals(destination) && ride.getAvaialableseats() > 0)
                available.add(rideMap.get(key));
        }
        return available;
    }

}
