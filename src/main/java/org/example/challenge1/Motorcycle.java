package org.example.challenge1;

public class Motorcycle extends Vehicle{
    private String typeOfMotorcycle;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String typeOfMotorcycle) {
        super(manufacturer, model, yearOfManufacture);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "typeOfMotorcycle='" + typeOfMotorcycle + '\'' +
                "} " + super.toString();
    }
}
