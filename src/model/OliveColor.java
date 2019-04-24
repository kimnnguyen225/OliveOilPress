package model;

public enum OliveColor {

    BLACK("black", 0x2E000000), PURPLE("purple", 0x2E0854);

    private long color;
    private String name;

    OliveColor(String name, long color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name;
    }
}
