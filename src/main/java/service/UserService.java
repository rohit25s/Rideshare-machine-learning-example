package service;

import exceptions.DuplicateUserExistsException;
import model.User;
import storage.RideRepository;
import storage.UserRepository;

public class UserService {

    private RideRepository rideRepository;
    private UserRepository userRepository;

    public UserService(RideRepository rideRepository, UserRepository userRepository){
        this.rideRepository = rideRepository;
        this.userRepository = userRepository;
    }

    public void addUser(User user){

        if(userRepository.getUser(user.getName())!=null)
            throw new DuplicateUserExistsException();
        userRepository.addUser(user);
    }

    public User getUser(String name){
       return userRepository.getUser(name);
    }

    public int getNoOfRidesTaken(String user){
        return userRepository.getNoOfRidesTaken(user);
    }

    public int getNoOfRidesOffered(String user){
        return userRepository.getNoOfRidesOffered(user);
    }

}
