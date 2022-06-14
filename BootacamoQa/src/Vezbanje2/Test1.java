package Vezbanje2;

public class Test1 {
    public static void main(String[] args) {
        Magija a = new Magija(54, "ABC");
        Magija b = new Magija(26, "BCA");
        IgracPokemon p = new IgracPokemon("ABC", 2, a, b, 2);
        IgracPokemon z = new IgracPokemon("Z", 5, b, a, 2);

//        System.out.println(z.getZivot());
//        p.baciMagiju(z);
//        System.out.println(z.getZivot());
        CpuPokemon v = new CpuPokemon("Z", 2,a,b);
        v.baciMagiju(z);
        System.out.println(z.getZivot());

    }
}
