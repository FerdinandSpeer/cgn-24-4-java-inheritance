package org.example;

import java.util.Objects;

public class Instrument {
    private String manufacturer;
    private String brand;
    private double price;
    private String color;

    public Instrument(String manufacturer, String brand, double price, String color) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void makeNoise(){
        System.out.println("Instrument sounds");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(brand, that.brand) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, brand, price, color);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "manufacturer='" + manufacturer + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
