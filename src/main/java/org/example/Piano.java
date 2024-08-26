package org.example;

public class Piano extends Instrument {
    private int numberOfOctaves;

    public Piano(String manufacturer, String brand, double price, String color, int numberOfOctaves) {
        super(manufacturer, brand, price, color);
        this.numberOfOctaves = numberOfOctaves;
    }
}
