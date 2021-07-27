package storage;

import model.Ride;
import model.User;
import model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<String, User> userByName;
    private Map<String, List<Car>> carByUser;
    private Map<String, List<Ride>> takenRidesForUser;


    public UserRepository(){
        userByName = new HashMap<>();
        carByUser = new HashMap<>();
        this.takenRidesForUser = new HashMap<>();
    }

    public User getUser(String name){
        return userByName.get(name);
    }

    public void addUser(User user){
        userByName.put(user.getName(),user);
    }

    public List<Car> getCarForUser(String name){
        return carByUser.get(name);
    }

    public void addRideToUser(String name, Ride ride) {
        if(this.takenRidesForUser.get(name)==null)
            takenRidesForUser.put(name, new ArrayList<>());

        takenRidesForUser.get(name).add(ride);

        int no = userByName.get(name).getRideShared();
        userByName.get(name).setRideShared(no+1);


        int no2 = userByName.get(ride.getUserName()).getRideOffered();
        userByName.get(ride.getUserName()).setRideOffered(no2+1);
        /*
        for(String key : carByUser.keySet()){
            if()
        }


         */

    }

    public int getNoOfRidesOffered(String user) {
        return userByName.get(user).getRideOffered();
    }

    public int getNoOfRidesTaken(String user){
        return userByName.get(user).getRideShared();
    }
}
