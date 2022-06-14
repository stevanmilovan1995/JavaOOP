package DomaciOOPX;

import java.util.ArrayList;

public class Autobus {
    private String naziv;
    private Vozac vozac;
    private int cenaKarte;
    private ArrayList<Putnik> putnik;

    public Autobus(String naziv, Vozac vozac, int cenaKarte, ArrayList<Putnik> putnik) {
        this.naziv = naziv;
        this.vozac = vozac;
        this.cenaKarte = cenaKarte;
        this.putnik = putnik;
    }


    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public ArrayList<Putnik> getPutnik() {
        return putnik;
    }

    public void setPutnik(ArrayList<Putnik> putnik) {
        this.putnik = putnik;
    }

    public void dodajPutnika(Putnik p) {
        putnik.add(p);
    }

    public void dodajPutnika(int i, Putnik p) {
        if (i >= 0 && i <= putnik.size()) {
            putnik.add(i, p);
        }
    }

    public boolean daLisuIstiPutnici(Putnik p, Putnik p2) {
        return p.getIme().equals(p2.getIme()) && p.getPrezime().equals(p2.getPrezime()) && p.getKolicinaNovca() == p2.getKolicinaNovca();
    }


    public void obrisiPutnika(Putnik p) {
        for (int i = 0; i < putnik.size(); i++) {
            Putnik trenutni = putnik.get(i);
            if (daLisuIstiPutnici(trenutni, p)) {
                putnik.remove(trenutni);
            }
        }
    }

    public void obrisiPutnika(int i) {
        if (i >= 0 && i <= putnik.size())
            putnik.remove(i);
    }

    public void dodajVozaca(Vozac v) {
        if(vozac == null) {
            this.vozac = v;
        }
    }

    public void obrisiVozaca() {
        this.vozac = null;
    }


    public void naplataKarata() {
        if (vozac != null) {
            for (Putnik trenutni : putnik) {
                int novac = trenutni.getKolicinaNovca();
                novac = novac - cenaKarte;
                trenutni.setKolicinaNovca(novac);
            }
        }
    }
}
