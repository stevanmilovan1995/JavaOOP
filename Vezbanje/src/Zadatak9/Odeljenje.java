package Zadatak9;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        if (dnevnik == null)
            this.dnevnik = new ArrayList<>();
        else
            this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        dnevnik = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void dodajUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    public void dodajUcenika(Ucenik u, int redniBroj) {
        if (redniBroj >= 0 && redniBroj <= dnevnik.size()) {
            dnevnik.add(redniBroj, u);
        } else
            System.out.println("Uneli ste redni broj koji nije validan!");
    }

    public boolean provera(Ucenik u, Ucenik provera) {
        return u.getIme().equals(provera.getIme())
                && u.getPrezime().equals(provera.getPrezime())
                && u.getOcene().toString().contentEquals(provera.getOcene().toString());
    }

    public void ispisiUcenika(Ucenik u) {
        for (int i = 0; i < dnevnik.size(); i++) {
            Ucenik trenutni = dnevnik.get(i);
            if (provera(trenutni, u)) {
                dnevnik.remove(i);
                return;
            }
        }
    }

    public void ispisiUcenika(int i) {
        if (i >= 0 && i <= dnevnik.size()) {
            dnevnik.remove(i);
        }
    }

    public void pogledajOcene(Ucenik u) {
        System.out.println(u.getOcene());

    }

    public void pogledajOcene(int i) {
        Ucenik tmp = dnevnik.get(i);
        System.out.println(tmp.getOcene());
    }

    public void prosecnaOcena(Ucenik u){
        System.out.println(u.prosek(u.getOcene()));
    }

    public void prosecnaOcena(int i) {
        Ucenik tmp = dnevnik.get(i);
        System.out.println(tmp.prosek(tmp.getOcene()));
    }

    public String izlistajDnevnik() {
        StringBuilder st = new StringBuilder();
        for (Ucenik temp : dnevnik) {
            st.append(temp.toString()).append("\n");
            st.append("\n");
        }
        return st.toString();
    }


}
