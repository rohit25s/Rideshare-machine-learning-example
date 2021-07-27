package service;

import Strategy.EarliestArrivalStrategy;
import Strategy.FastestRideStrategy;
import Strategy.RideStrategyImpl;
import model.Ride;
import storage.RideRepository;
import storage.UserRepository;

public class RideService {

    private RideRepository rideRepository;
    private UserRepository userRepository;

    public RideService(RideRepository rideRepository, UserRepository userRepository){
    this.rideRepository = rideRepository;
    this.userRepository = userRepository;
    }

    public void offerRide(String id, Ride ride){

   rideRepository.addRide(id,ride);
    }

    public Ride selectRide(String name, String origin,String destination, String strategy) {
        RideStrategyImpl rideStrategy;

        if (strategy.equals("Earliest")) {
            rideStrategy = new EarliestArrivalStrategy(rideRepository);
        } else {
            rideStrategy = new FastestRideStrategy(rideRepository);
        }
        Ride ride = rideStrategy.getRide(origin,destination);

        if (ride != null) {
            userRepository.addRideToUser(name, ride);
        }
        return ride;


    }
}
