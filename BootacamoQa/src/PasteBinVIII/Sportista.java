package PasteBinVIII;

public class Sportista extends Osoba {
    private String sport;
    private String klub;
    private int brNaDresu;

    public Sportista(String ime, String prezime, String sport, String klub, int brNaDresu) {
        super(ime, prezime);
        this.sport = sport;
        this.klub = klub;
        this.brNaDresu = brNaDresu;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBrNaDresu() {
        return brNaDresu;
    }

    public void setBrNaDresu(int brNaDresu) {
        this.brNaDresu = brNaDresu;
    }
}
