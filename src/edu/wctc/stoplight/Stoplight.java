package edu.wctc.stoplight;

public class Stoplight {
    private Light currentLight;

    public Stoplight() {
        Light red = new RedLight();
        Light yellow = new YellowLight();
        Light green = new GreenLight();

        red.setBelow(yellow);
        yellow.setAbove(red);
        yellow.setBelow(green);
        green.setAbove(yellow);

        currentLight = green;
    }

    public void controlTraffic() {
        Light nextLight = currentLight.switchLight();

        if(nextLight != null) {
            currentLight = nextLight;
        }
        else
        {
            //if you've reached the top, move back two lights
            nextLight = currentLight.getPrevious();
            currentLight = nextLight.getPrevious();
        }
    }

    public String trafficResponse(Car car) {
        if(currentLight instanceof Enforceable)
            return ((Enforceable)currentLight).enforceRule(car);
        return "Light is broken. Temporary stop sign. Sorry for the convenience.";
    }

    @Override
    public String toString() {
        return currentLight.toString();
    }
}
