package DomaciOOPX;

public class Putnik extends Covek {
    public int kolicinaNovca;

    public Putnik(String ime, String prezime, int kolicinaNovca) {
        super(ime, prezime);
        this.kolicinaNovca = kolicinaNovca;
    }

    public int getKolicinaNovca() {
        return kolicinaNovca;
    }
    public void setKolicinaNovca(int kolicinaNovca) {
        this.kolicinaNovca = kolicinaNovca;
    }

    public boolean dodajNovac(int kolicina) {
        this.kolicinaNovca += kolicina;
        if(getKolicinaNovca() == this.kolicinaNovca + kolicina) {
            return true;
        }
        return false;
    }

    public boolean oduzmiNovac(int kolicina) {
        if(getKolicinaNovca() < kolicina) {
            setKolicinaNovca(0);
            return false;
        }
        else {
            this.kolicinaNovca -= kolicina;
            return true;
        }
    }


}
