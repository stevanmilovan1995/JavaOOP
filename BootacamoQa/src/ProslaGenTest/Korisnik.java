package ProslaGenTest;


import java.util.ArrayList;

public class Korisnik {
    private int id;
    private String ime;
    private String prezime;
    private Broj broj;
    private ArrayList<Usluga> istorijaUsluga;

    public Korisnik(int id, String ime, String prezime, Broj broj, ArrayList<Usluga> istorijaUsluga) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        this.istorijaUsluga = istorijaUsluga;
    }

    public Korisnik(int id, String ime, String prezime, Broj broj) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        this.istorijaUsluga = new ArrayList<>();
    }

    public void posaljiPoruku(Broj b, Poruka p) {
        p.setTekstPoruke(p.getTekstPoruke());
        istorijaUsluga.add(p);
    }

    public void pozovi(Broj b, int trajanjePoziva) {
        Poziv p2 = new Poziv(broj, b , trajanjePoziva);
        istorijaUsluga.add(p2);
    }

    public double cenaSvihUsluga() {
        double sum = 0;
        for (int i = 0; i < istorijaUsluga.size(); i++) {
            sum += istorijaUsluga.get(i).cenaUsluge();
        }
        return sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ").append(broj).append("\n");
        sb.append("Istorija usluga: ").append("\n");
        for (int i = 0; i < istorijaUsluga.size(); i++) {
            sb.append(istorijaUsluga.get(i)).append("\n");
        }
        sb.append("Cena svih usluga korisnika je: ").append(cenaSvihUsluga());
        return sb.toString();
    }
}
