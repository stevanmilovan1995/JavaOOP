package PasteBinVIII;

import java.util.ArrayList;

//7. Napisati naredne klase:
//        vozilo  - Napisati klasu Automobil. Automobil ima
//        1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
//        2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
//        3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
//Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
//        Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;

    private Vlasnik vlasnik;

    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    public Automobil(String marka, String model, int serijskiBroj, Vlasnik v) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = v;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Automobil{");
        sb.append("marka='").append(marka).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", serijskiBroj=").append(serijskiBroj);
        sb.append(", vlasnik=").append(vlasnik);
        sb.append('}');
        return sb.toString();
    }
}
