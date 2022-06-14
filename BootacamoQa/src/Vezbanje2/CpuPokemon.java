package Vezbanje2;

import java.util.Objects;



public class CpuPokemon extends  Pokemon{
    private static Random random;

    public CpuPokemon(String ime, int nivo, Magija magija1, Magija magija2) {
        super(ime, nivo, magija1, magija2);
    }


    @Override
    public void baciMagiju(Pokemon neprijatelj) {
//        double broj = Random.nextDouble();
        if(Random.nextDouble() == 1) {
            neprijatelj.setZivot(neprijatelj.getZivot() - getMagija1().getSnaga());
        } else
            neprijatelj.setZivot(neprijatelj.getZivot() - getMagija2().getSnaga());
    }
}
