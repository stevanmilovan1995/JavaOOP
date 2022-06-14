package PasteBinVIII;

import PasteBinVIII.Grad;

import java.util.ArrayList;

public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm, ArrayList<Osoba> prijavljeneOsobe) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if(udaljenostUKm < 0) {
            System.out.println("Kilometraza ne sme da bude negativna!");
        } else
            this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        if(udaljenostUKm < 0) {
            System.out.println("Kilometraza ne sme da bude negativna!");
        } else
            this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if(udaljenostUKm < 0) {
            System.out.println("Kilometraza ne sme da bude negativna!");
        } else
            this.udaljenostUKm = udaljenostUKm;
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    public String daLiImaVodju(Osoba vP) {
        StringBuilder sb = new StringBuilder();
        if(!(vP.getIme() == null && vP.getPrezime() == null))
           sb.append(vP.getIme()).append(" ").append(vP.getPrezime());
           else
            sb.append("Putovanje nema vodju!");
           return sb.toString();
    }

    public void prijavljeni(ArrayList<Osoba> prijavljeneOsobe) {
        for (int i = 0; i < prijavljeneOsobe.size(); i++) {
            System.out.println(prijavljeneOsobe.get(i) + ", ");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Putovanje{");
        sb.append("destinacija=").append(destinacija);
        sb.append("Vodja puta je: ").append(daLiImaVodju(vodjaPuta));
        sb.append(", vozilo=").append(vozilo);
        sb.append(", udaljenostUKm=").append(udaljenostUKm);
        for (Osoba osoba : prijavljeneOsobe) {
            sb.append(osoba.getIme()).append(" ").append(osoba.getPrezime()).append("\n");
        }
        return sb.toString();
    }
}
