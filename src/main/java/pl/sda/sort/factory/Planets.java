package pl.sda.sort.factory;

public enum Planets {
    EARTH(6371),
    MARS(3000);

    int radius;

    Planets(int radius) {
        this.radius = radius;
    }

    public float getCircumference() {
        return radius*2*3.14f;
    }
 }
