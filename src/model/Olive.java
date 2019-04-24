package model;

import java.text.NumberFormat;

public class Olive {


    //each instance of Olive will represent a single piece of fruit, a single olive
    // public static final String KALAMATA = "Kalamata";
    private OliveName typeName = OliveName.KALAMATA;
    // private String name = "";
    private long color = 0x2E0854;
    private double oil = 1.375; //amount of oil gets from a single Kalamata olive
    // 1375 olives made 1 litter of oil, 1L = 1000mL

    public Olive(){}

    public Olive(OliveName  typeName, long color, double oil) {
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

//    public Olive(String name, long color, double oil) {
//        this.name = name;
//        this.color = color;
//        this.oil = oil;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }


    public double crush() { //return amount of oil that olive yield
        System.out.println("Ouch! -- 1 olive has been crushed");
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }
}
