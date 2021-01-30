package edu.wctc.stoplight;

public class Main {

    public static void main(String[] args) {
        Stoplight stoplight = new Stoplight();
        Car car = new Car();

        for(int i = 0; i < 8; i++) {
            System.out.println(stoplight);
            System.out.println(stoplight.trafficResponse(car));
            stoplight.controlTraffic();
        }

    }
}
