package ProslaGenTest;

import java.util.ArrayList;

public class Proba {
    public static void main(String[] args) {
        Broj br = new Broj("381", "64", "1234567", false);
        Broj br2 = new Broj("381", "64", "1234567", false);

        Poruka p = new Poruka(br, br2, "Cao Nikola.");
        Poruka p2 = new Poruka(br, br2, "Cao Strahinja.");

        System.out.println(p);
        System.out.println("------------");
        ArrayList<Usluga> u = new ArrayList<>();
        u.add(p);

        Poziv poz = new Poziv(br, br2, 156);
        System.out.println(poz);
        Korisnik a = new Korisnik(1,"A", "B", br, u);
        a.posaljiPoruku(br2, p2);
        System.out.println(a);
        Poziv p3 = new Poziv(br,br2, 135);
        a.pozovi(br2, 86);
        System.out.println(a);




    }
}
