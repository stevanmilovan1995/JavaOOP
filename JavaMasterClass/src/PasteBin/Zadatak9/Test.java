package PasteBin.Zadatak9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Grad pariz = new Grad("Pariz", "Francuska");
        Osoba petar = new Osoba("Petar", "Petrovic");
        Automobil bmw = new Automobil("BMW", 2016, 192000);
        Putovanje francuska = new Putovanje(pariz, petar, bmw, 1300);
        ArrayList<String> osobe = new ArrayList<>();
        osobe.add("Zoran Milicevic");
        osobe.add("Pera Peric");
        osobe.add("Marko Markovic");

        francuska.setPrijavljeneOsobe(osobe);
        francuska.prijava(osobe, "Mitar Miric");
        francuska.odjava(osobe, "Mitar Miric");
        System.out.println(francuska);

    }
}
