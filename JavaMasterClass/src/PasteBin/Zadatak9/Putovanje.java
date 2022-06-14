package PasteBin.Zadatak9;

import java.util.ArrayList;

public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil automobil;
    private double udaljenostUKm;
    private ArrayList<String> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil automobil, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.automobil = automobil;
        if (udaljenostUKm < 0) {
            System.out.println("Kilometraza ne sme da bude negativna!");
        } else {
            this.udaljenostUKm = udaljenostUKm;
        }
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Putovanje(Grad destinacija, Automobil automobil, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.automobil = automobil;
        this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if (udaljenostUKm < 0) {
            System.out.println("Kilometraza ne sme da bude negativna!");
        } else {
            this.udaljenostUKm = udaljenostUKm;
        }
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public Automobil getAutomobil() {
        return automobil;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public ArrayList<String> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<String> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ").append(destinacija.getImeGrada()).append(", ").append(destinacija.getImeDrzave()).append("\n");
        if(vodjaPuta.getIme().equals("") && vodjaPuta.getPrezime().equals("")) {
            sb.append("Putovanje nema vodju puta! \n");
        } else {
            sb.append("Vodja puta je: ").append(vodjaPuta.getIme()).append(" ").append(vodjaPuta.getPrezime()).append("\n");

        }
        sb.append("Putuje se automobilom: ").append(automobil.getMarka()).append(", ").append(automobil.getGodinaProizvodnje()).append(", ").append(automobil.getKilometraza()).append("\n");
        sb.append("Udaljenost do destinacije u kilometrima je: ").append(udaljenostUKm).append("\n");
        sb.append("Prijavljene osobe: \n");
        prijavljeneOsobe.forEach(osoba -> sb.append(osoba).append("\n"));
        sb.append("Za ovo putovanje ce biti potrebno oko ").append(Math.round(satnicaZaPutovanje(95))).append(" sati.");
        return sb.toString();
    }

    public double satnicaZaPutovanje(double prosecnaBrzina) {
        double satnica;
        return satnica = this.udaljenostUKm / prosecnaBrzina;
    }

    public void prijava(ArrayList<String> lista, String osoba) {
        lista.add(osoba);
    }

    public void odjava(ArrayList<String> lista, String osoba) {
        lista.remove(osoba);
    }
}
