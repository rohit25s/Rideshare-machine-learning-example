import model.Car;
import model.Gender;
import model.Ride;
import model.User;
import service.RideService;
import service.UserService;
import storage.RideRepository;
import storage.UserRepository;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    public static void main(String[] args){

        RideRepository rideRepository = new RideRepository();
        UserRepository userRepository = new UserRepository();

        UserService userService = new UserService(rideRepository, userRepository);
        RideService rideService = new RideService(rideRepository, userRepository);

        User user1 = new User("Rohan", Gender.M, 36);
        User user2 = new User("Nandini", Gender.F, 30);
        User user3 = new User("Shipra", Gender.F, 29);

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);

        Car car1 = new Car("Rohan","KA-01-12345","Swift", 3);
        Car car2 = new Car("Shipra","KA-01-12346","Polo", 3);



        SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        Ride ride1 = new Ride("1", "Rohan", car1, "Bangalore","Hyderabad", new Date(2020, 10, 01 ,7,00,00),12,3 );


        Ride ride2 = new Ride("2", "Shipra", car2, "Bangalore","Hyderabad", new Date(2020, 10, 01 ,10,00,00),11,3 );

        Ride ride3 = new Ride("3", "Shipra", car2, "Bangalore","Hyderabad", new Date(2020, 10, 01 ,10,00,00),11,3 );


        rideService.offerRide("1", ride1);
        rideService.offerRide("2",ride2);
        rideService.offerRide("3",ride3);

        System.out.println("ride found for earliest strategy"+ rideService.selectRide("Rohan", "Bangalore", "Hyderabad", "Earliest").getUserName() );
        System.out.println("ride found for fastest strategy"+ rideService.selectRide("Rohan", "Bangalore", "Hyderabad", "Fastest").getUserName() );



        System.out.println("No of rides taken for user :"+ user1.getName() + "no = "+ userService.getNoOfRidesTaken(user1.getName()));

        System.out.println("No of rides offered for user :"+ user2.getName() + "no = "+ userService.getNoOfRidesOffered(user1.getName()));

    }
}
