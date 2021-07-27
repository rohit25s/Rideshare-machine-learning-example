package model;

public class User {

    private String name;
    private int age;
    private Gender gender;
    private int rideShared;
    private int rideOffered;

    public User(String name, Gender gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rideOffered = 0;
        this.rideShared = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRideShared() {
        return rideShared;
    }

    public void setRideShared(int rideShared) {
        this.rideShared = rideShared;
    }

    public int getRideOffered() {
        return rideOffered;
    }

    public void setRideOffered(int rideOffered) {
        this.rideOffered = rideOffered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", rideShared=" + rideShared +
                ", rideOffered=" + rideOffered +
                '}';
    }
}
