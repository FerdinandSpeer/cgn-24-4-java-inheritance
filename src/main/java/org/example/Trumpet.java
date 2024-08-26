package org.example;

public class Trumpet extends Instrument {
    private boolean hasCase;

    public Trumpet(String manufacturer, String brand, double price, String color, boolean hasCase) {

        super(manufacturer, brand, price, color);
        this.hasCase = hasCase;
    }

    @Override
    public void makeNoise() {
        System.out.println("Trumpet sounds");
    }
}
