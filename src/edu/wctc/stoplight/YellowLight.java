package edu.wctc.stoplight;

public class YellowLight extends Light implements Enforceable {

    public YellowLight() {
        super("Yellow");
    }

    public String enforceRule(Car car) {
        car.setStatus("slowing");
        car.moveCar();

        return(car.toString());
    }
}
