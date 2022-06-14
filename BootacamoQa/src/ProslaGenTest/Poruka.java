package ProslaGenTest;

public class Poruka extends Usluga{
    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    @Override
    public double cenaUsluge() {
        double cena;
        if(getBrojOd() != null && getBrojKa() != null && getBrojOd() != getBrojKa() && !(getBrojKa().isFiksnibroj() & getBrojOd().isFiksnibroj())) {
            cena = 3;
        }
        else
            cena = 0;
        return cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ").append(tekstPoruke);
        return sb.toString();
    }
}
