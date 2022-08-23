package edu.wctc.stoplight;

public class Main {

    public static void main(String[] args) {
        Stoplight stoplight = new Stoplight();
        Car car = new Car();

        //Test out a few stoplight events
        for(int i = 0; i < 6; i++) {
            System.out.println(stoplight);
            System.out.println(stoplight.trafficResponse(car));
            stoplight.controlTraffic();
        }

    }
}
