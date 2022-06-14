package Zadatak9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Double> o =new ArrayList<>();
        ArrayList<Double> o2 = new ArrayList<>();
        ArrayList<Double> o3 = new ArrayList<>();
        dodajOcenu(o, 5.0);
        dodajOcenu(o, 4.44);
        dodajOcenu(o, 2.21);
        dodajOcenu(o, 1.78);
        dodajOcenu(o, 3.23);
        dodajOcenu(o2, 2.23);
        dodajOcenu(o2, 1.17);
        dodajOcenu(o2, 4.55);
        dodajOcenu(o2, 4.75);
        dodajOcenu(o2, 3.82);
        dodajOcenu(o3, 5.0);
        dodajOcenu(o3, 5.0);
        dodajOcenu(o3, 4.75);
        dodajOcenu(o3, 3.95);
        dodajOcenu(o3, 4.12);

        Ucenik zivan = new Ucenik("Zivan", "Pijanc", o);
        Ucenik ivan = new Ucenik("Ivan", "Ivanovic", o2);
        Ucenik djordje = new Ucenik("Djordje", "Cvarkov", o3);

        System.out.println(zivan);
        System.out.println(zivan.prosek(o));
        System.out.println("-----------------");
        System.out.println(ivan);
        System.out.println(ivan.prosek(o2));
        System.out.println("-----------------");
        System.out.println(djordje);
        System.out.println(djordje.prosek(o3));


        ArrayList<Ucenik> sviUcenici = new ArrayList<>();
        sviUcenici.add(zivan);
        sviUcenici.add(ivan);
        sviUcenici.add(djordje);
        Odeljenje prvo = new Odeljenje("Cetvrto-Tri", sviUcenici);
        System.out.println("-----------------");
        prvo.pogledajOcene(djordje);
        prvo.prosecnaOcena(2);
        System.out.println("-----------------");

        System.out.println(prvo.izlistajDnevnik());
    }

    public static void dodajOcenu(ArrayList<Double> list, double ocena) {
        list.add(ocena);
    }
}
