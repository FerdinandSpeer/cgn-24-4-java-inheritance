package org.example;

public class Main {
    public static void main(String[] args) {

        Piano piano = new Piano(" "," ", 3400, "Black", 5);
        Gitarre gitarre = new Gitarre("Fender", "Fender", 160.55, "Black", true);
        gitarre.setManufacturer("Gibson");

        System.out.println(gitarre);
        gitarre.makeNoise();

        playInstrument(gitarre);
        playInstrument(piano);



    }

    public static void playInstrument(Instrument instrument) {
        instrument.makeNoise();
    }
}