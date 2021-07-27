package Strategy;

import exceptions.NoAvailableRideException;
import model.Ride;
import storage.RideRepository;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class EarliestArrivalStrategy implements RideStrategyImpl{

    public static final long HOUR = 3600*1000;

    private RideRepository rideRepository;
    public EarliestArrivalStrategy(RideRepository repository){
        this.rideRepository = repository;
    }

    @Override
    public Ride getRide(String origin, String destination) throws NoAvailableRideException {
        List<Ride> availableRides = rideRepository.getListOfAvailableRides(origin, destination);
        if(availableRides.size()==0)
            throw new NoAvailableRideException();

        SimpleDateFormat ft =
                new SimpleDateFormat("MM.dd.yyyy hh:mm:ss");
        Collections.sort(availableRides, (a, b) -> (int) addDate(a.getStartTime(),a.getDurationInHrs()).getTime() - (int) addDate(a.getStartTime(),a.getDurationInHrs()).getTime());

        return availableRides.get(0);
    }

    public Date addDate(Date oldDate, int durationInHrs){
        Date newDate = new Date(oldDate.getTime() + durationInHrs * HOUR);
        return newDate;
    }
}
