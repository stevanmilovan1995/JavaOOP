public abstract class Planinar {
    private int id;
    private int brojPoena;
    private String ime;
    private String prezime;

    public Planinar(int id, int brojPoena, String ime, String prezime) {
        this.id = id;
        this.brojPoena = brojPoena;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract  void stampaj();
    public abstract  double clanarina();
    public abstract String uspesanUspon(Planina p);
}
