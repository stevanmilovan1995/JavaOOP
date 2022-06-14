package ProslaGenTest;

public abstract class Usluga {
    private Broj brojOd;
    private Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    public abstract double cenaUsluge();



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(brojOd.getTekstualniKod()).append(" ").append(brojOd.getPozivni()).append(" ").append(brojOd.getBroj());
        sb.append(" -> ").append("+").append(brojKa.getTekstualniKod()).append(" ").append(brojKa.getPozivni()).append(" ").append(brojKa.getBroj());
        return sb.toString();

    }
}
