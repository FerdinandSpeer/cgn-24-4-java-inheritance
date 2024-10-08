package org.example;

import org.example.challenge1.Car;
import org.example.challenge1.Motorcycle;
import org.example.challenge1.Vehicle;
import org.example.session1.Gitarre;
import org.example.session1.Instrument;
import org.example.session1.Piano;

public class Main {
    public static void main(String[] args) {
        //Session1:
        Piano piano = new Piano(" "," ", 3400, "Black", 5);
        Gitarre gitarre = new Gitarre("Fender", "Fender", 160.55, "Black", true);
        gitarre.setManufacturer("Gibson");

        System.out.println(gitarre);
        gitarre.makeNoise();

        playInstrument(gitarre);
        playInstrument(piano);

        System.out.println("Ab hier Challenge1:");
        //Challenge1:
        Vehicle vehicle = new Vehicle("Hyundai", "Kona", 200);

        System.out.println(vehicle);

        Car car = new Car("Skoda", "Enyaq", 2022, 5);

        System.out.println(car);

        //Bonus1:
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2024, "Sportbike");

        System.out.println(motorcycle);

    }

    public static void playInstrument(Instrument instrument) {
        instrument.makeNoise();
    }
}