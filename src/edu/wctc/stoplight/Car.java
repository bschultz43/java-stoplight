package edu.wctc.stoplight;

public class Car {
    private boolean isMoving;
    private String status;

    public Car() {
        isMoving = false;
        status = "stopped";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void moveCar() {
        isMoving = true;
    }

    public void stopCar() {
        isMoving = false;
    }

    public boolean isCarMoving() {
        return isMoving;
    }

    @Override
    public String toString() {
        return String.format("The car is %s.", status);
    }
}
