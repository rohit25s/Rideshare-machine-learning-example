package model;

import java.util.Date;

public class Ride {
    private String id;
    private Car car;
    private String userName;
    private String origin;
    private String destination;
    private Date startTime;
    private int durationInHrs;
    private int avaialableseats;

    public Ride(String id,String userName, Car car, String origin, String destination,Date startTime, int durationInHrs, int availableSeats) {
        this.userName = userName;
        this.car = car;
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.startTime = startTime;
        this.durationInHrs = durationInHrs;
        this.avaialableseats = availableSeats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getDurationInHrs() {
        return durationInHrs;
    }

    public void setDurationInHrs(int durationInHrs) {
        this.durationInHrs = durationInHrs;
    }

    public int getAvaialableseats() {
        return avaialableseats;
    }

    public void setAvaialableseats(int avaialableseats) {
        this.avaialableseats = avaialableseats;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", userName='" + userName + '\'' +
                '}';
    }
}
