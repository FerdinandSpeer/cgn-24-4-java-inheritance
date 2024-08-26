package org.example;

import java.util.Objects;

//Vererbung der Instrumenten Klasse über "extends Instrument"
public class Gitarre extends Instrument {
    private boolean isElectric;

    public Gitarre(String manufacturer, String brand, double price, String color, boolean isElectric) {
        super(manufacturer, brand, price, color); //"super" -> Constructor der Elternklasse
        //Constructor muss vorhanden sein, auch wenn "color" nicht gebraucht wird
        this.isElectric = isElectric;
    }

    //mit override unter Generate kann eine Override Methode erstellt werden:
    @Override
    public void makeNoise() {
        System.out.println("Guitar sounds!");;
    }

    public boolean isElectric() {

        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gitarre gitarre = (Gitarre) o;
        return isElectric == gitarre.isElectric;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isElectric);
    }

    @Override
    public String toString() {
        return "Gitarre{" +
                "isElectric=" + isElectric +
                "} " + super.toString();
    }
}
