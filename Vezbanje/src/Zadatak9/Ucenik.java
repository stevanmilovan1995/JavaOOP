package Zadatak9;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Double> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Double> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Double> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Double> ocene) {
        this.ocene = ocene;
    }

    public double prosek(ArrayList<Double> ocene) {
        double sum = 0;
        for (Double aDouble : ocene) {
            sum += aDouble;
        }
        return sum / ocene.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ima ocene: ").append("\n");
        for (Double aDouble : ocene) {
            sb.append(aDouble).append(" ");
        }
        return sb.toString();
    }
}
