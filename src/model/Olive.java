package model;

public abstract class Olive {

    //each instance of Olive will represent a single piece of fruit, a single olive
    // public static final String KALAMATA = "Kalamata";
    private OliveName typeName;
    private OliveColor color;
    private double oil; //amount of oil gets from a single olive

    public Olive(OliveName  typeName, OliveColor color, double oil) {
        this.typeName = typeName;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getTypeName() {
        return typeName;
    }

    public void setTypeName(OliveName typeName) {
        this.typeName = typeName;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public double getOil() { //return amount of oil that olive yield
        String msg = typeName + " from " + getOriginCountry() + " has " + oil + " mL of oil";
        System.out.println(msg);
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public abstract String getOriginCountry();
}
