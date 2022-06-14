package PasteBinVIII;

public class Grad {
    private String ime;
    private int brStanovnika;
    private String drzava;

    public Grad(String ime, int brStanovnika, String drzava) {
        this.ime = ime;
        this.brStanovnika = brStanovnika;
        this.drzava = drzava;
    }

    public Grad() {
        ime = "";
        brStanovnika = 0;
        drzava = "";
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrStanovnika() {
        return brStanovnika;
    }

    public void setBrStanovnika(int brStanovnika) {
        this.brStanovnika = brStanovnika;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ime='").append(ime).append('\'');
        sb.append(", brStanovnika=").append(brStanovnika);
        sb.append(", drzava='").append(drzava).append('\'');
        return sb.toString();
    }
}
