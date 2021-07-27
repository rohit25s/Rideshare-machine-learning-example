package Strategy;

import exceptions.NoAvailableRideException;
import model.Ride;

public interface RideStrategyImpl {

    public Ride getRide(String origin, String destination) throws NoAvailableRideException;
}
