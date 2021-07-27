package Strategy;

import model.Ride;
import storage.RideRepository;
import exceptions.NoAvailableRideException;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FastestRideStrategy implements RideStrategyImpl{

    private RideRepository rideRepository;
    public FastestRideStrategy(RideRepository repository){
        this.rideRepository = repository;
    }

    @Override
    public Ride getRide(String origin, String destination) throws NoAvailableRideException {
        List<Ride> availableRides = rideRepository.getListOfAvailableRides(origin,destination);
        if(availableRides.size()==0)
            throw new NoAvailableRideException();

        Collections.sort(availableRides, (a,b) -> a.getDurationInHrs() - b.getDurationInHrs());

        return availableRides.get(0);
    }
}
