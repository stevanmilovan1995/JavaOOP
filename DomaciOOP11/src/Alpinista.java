public class Alpinista extends  Planinar{
    private int ostvareniPoeni;

    public Alpinista(int id, int brojPoena, String ime, String prezime, int ostvareniPoeni) {
        super(id, brojPoena, ime, prezime);
        this.ostvareniPoeni = ostvareniPoeni;
    }

    public void setOstvareniPoeni(int ostvareniPoeni) {
        this.ostvareniPoeni = ostvareniPoeni;
    }

    @Override
    public double clanarina() {
        double clanarina = 1500 - (ostvareniPoeni * 50);
        if(clanarina > 0)
            return clanarina;
        else
            return 0;
    }

    @Override
    public String uspesanUspon(Planina p) {
        if (p.getVisina() > 0 && p.getVisina() <= 4000) {
            return "Uspesno se uspeo";
        }
        return "Nije se uspesno uspeo";
    }

    @Override
    public void stampaj() {
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rekrativac, id: ").append(getId()).append("\n");
        sb.append("Ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Broj poena: ").append(getBrojPoena());
        return sb.toString();
    }
}
