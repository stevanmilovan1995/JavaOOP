package ZadaciPasteBin.Zadatak8;

public class Grad {
    private String ime;
    private int brojStanovnika;
    private String drzava;

    public Grad(String ime, int brojStanovnika, String drzava) {
        this.ime = ime;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
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
        sb.append("Ime grada: ").append(ime).append("\n");
        sb.append("Broj stanovnika: ").append(brojStanovnika).append("\n");
        sb.append("Drzava: ").append(drzava).append("\n");
        return sb.toString();
    }
}
