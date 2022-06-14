package ProslaGenTest;

public class Poziv extends Usluga{
    private int trajanjeuSekundima;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeuSekundima) {
        super(brojOd, brojKa);
        this.trajanjeuSekundima = trajanjeuSekundima;
    }

    public int getTrajanjeuSekundima() {
        return trajanjeuSekundima;
    }

    public void setTrajanjeuSekundima(int trajanjeuSekundima) {
        this.trajanjeuSekundima = trajanjeuSekundima;
    }

    public String sekUMin(int sec){
        int min = -1;
        int sek = sec;
        for (int i = 0; i <= sec; i += 60) {
            min++;
            sek = sec - i;
        }
        return min + ":" + sek;
    }




    @Override
    public double cenaUsluge() {
        double cena;
        int brojac = 0;
        if(getBrojOd() != null && getBrojKa() != null && getBrojOd() != getBrojKa()) {
            for (int i = 0; i < trajanjeuSekundima; i+=60) {
                brojac++;
            }
        }
        cena = 10 * brojac;
        return cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" <").append(sekUMin(trajanjeuSekundima)).append(">");
        return sb.toString();
    }
}
