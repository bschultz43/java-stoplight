package edu.wctc.stoplight;

public class RedLight extends Light implements Enforceable {

    public RedLight() {
        super("Red");
    }

    public String enforceRule(Car car) {
        car.setStatus("stopped");

        return(car.toString());
    }
}
