package Vezbanje2;

public class Magija {
    private int snaga;
    private String ime;


    public Magija(int snaga, String ime) {
        this.snaga = snaga;
        this.ime = ime;
    }

    public Magija() {
    }

    public int getSnaga() {
        return snaga;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(snaga);
        return sb.toString();
    }
}
