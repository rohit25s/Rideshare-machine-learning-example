package model;

public class Car {


    private String user;
    private String carNo;
    private String carName;
    private int ridesAvailable;

    public Car(String user,String carNo, String carName, int ridesAvailable) {
        this.user = user;
        this.carNo = carNo;
        this.carName = carName;
        this.ridesAvailable = ridesAvailable;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getRidesAvailable() {
        return ridesAvailable;
    }

    public void setRidesAvailable(int ridesAvailable) {
        this.ridesAvailable = ridesAvailable;
    }

    @Override
    public String toString() {
        return "Car{" +
                "user='" + user + '\'' +
                ", carNo='" + carNo + '\'' +
                ", carName='" + carName + '\'' +
                ", ridesAvailable=" + ridesAvailable +
                '}';
    }
}

