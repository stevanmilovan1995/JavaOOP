public class RekreativniPlaninar extends Planinar{
    public double tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int id, int brojPoena, String ime, String prezime, double tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, brojPoena, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public double getMaxUspon() {
        return maxUspon;
    }


    @Override
    public double clanarina() {
        double clanarina = 1000;
        return clanarina;
    }

    @Override
    public String uspesanUspon(Planina p) {
        maxUspon -= tezinaOpreme * 50;
        if (maxUspon > p.getVisina()) {
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
        sb.append("Okrug: ").append(nazivOkruga);
        return sb.toString();
    }
}
