package edu.wctc.stoplight;

public abstract class Light {
    private boolean isLit;
    private String color;
    private Light above, below;

    public Light(String color)
    {
        isLit = false;
        this.color = color;
    }

    public void flipLight() {
        isLit = !isLit;
    }

    public String getColor() {
        return color;
    }

    public void setAbove(Light above) {
        this.above = above;
    }

    public void setBelow(Light below) {
        this.below = below;
    }

    public Light switchLight() {
        flipLight();
        return above;
    }

    public Light getPrevious() {
        return below;
    }

    @Override
    public String toString() {
        return color;
    }
}
