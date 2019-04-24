package model;

public class Ligurian extends Olive {

    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 2.999);
    }

    @Override
    public String getOriginCountry() {
        return "Greece";
    }
}
