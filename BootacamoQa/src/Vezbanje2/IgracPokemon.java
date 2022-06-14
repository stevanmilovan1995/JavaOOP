package Vezbanje2;

public class IgracPokemon extends Pokemon{
    private int izabranaMagija;

    public IgracPokemon(String ime, int nivo, Magija magija1, Magija magija2, int izabranaMagija) {
        super(ime, nivo, magija1, magija2);
        if(izabranaMagija == 1 || izabranaMagija == 2) {
            this.izabranaMagija = izabranaMagija;
        }
    }

    public Magija getIzabranaMagija() {
        if (izabranaMagija == 1)
            return getMagija1();
        else if(izabranaMagija == 2)
            return getMagija2();
        else
            return null;
    }

    public void setIzabranaMagija(int i) {
        if(i == 1 || i == 2) {
            this.izabranaMagija = i;
        }
    }

    @Override
    public void baciMagiju(Pokemon neprijatelj) {
//        int zivot = neprijatelj.getZivot() - getIzabranaMagija().getSnaga();
        neprijatelj.setZivot(neprijatelj.getZivot() - getIzabranaMagija().getSnaga());
    }
}
