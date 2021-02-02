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
        Light temp = currentLight.switchLight();

        if(temp != null) {
            currentLight = temp;
        }
        else
        {
            //if you've reached the top, move back two lights
            temp = currentLight.getPrevious();
            currentLight = temp.getPrevious();
        }
    }

    public String trafficResponse(Car car) {
        if(currentLight instanceof Enforceable)
            return ((Enforceable)currentLight).enforceRule(car);
        return "Light is broken. Temporary stop sign.";
    }

    @Override
    public String toString() {
        return currentLight.toString();
    }
}
