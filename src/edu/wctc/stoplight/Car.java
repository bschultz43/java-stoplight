package edu.wctc.stoplight;

public class Car {
    private String status;

    public Car() {
        status = "stopped";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("The car is %s.", status);
    }
}
