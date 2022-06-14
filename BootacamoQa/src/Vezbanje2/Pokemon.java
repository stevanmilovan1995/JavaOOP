package Vezbanje2;

public abstract class Pokemon {
    private String ime;
    private int nivo;
    private Magija magija1;
    private Magija magija2;
    private int zivot;

    public Pokemon(String ime, int nivo, Magija magija1, Magija magija2) {
        this.ime = ime;
        if(nivo >= 1) {
            this.nivo = nivo;
        }
        else
            this.nivo = 1;
        this.magija1 = magija1;
        this.magija2 = magija2;
        this.zivot = 100;
    }

    public String getIme() {
        return ime;
    }

    public int getNivo() {
        return nivo;
    }

    public Magija getMagija1() {
        return magija1;
    }

    public Magija getMagija2() {
        return magija2;
    }

    public int getZivot() {
        return zivot;
    }

    public void setZivot(int zivot) {
        this.zivot = zivot;
    }

    public void nanesiStetu(int kolikoStete) {
        this.zivot-= kolikoStete;
    }

    public abstract void baciMagiju(Pokemon neprijatelj);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[lv").append(nivo).append("]").append(" ").append(ime).append("\n");
        return sb.toString();
    }
}
