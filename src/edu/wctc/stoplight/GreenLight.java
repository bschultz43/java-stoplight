package edu.wctc.stoplight;

public class GreenLight extends Light implements Enforceable {

    public GreenLight() {
        super("Green");
    }

    public String enforceRule(Car car) {
        car.setStatus("moving");

        return(car.toString());
    }
}
