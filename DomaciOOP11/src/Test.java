import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Planina cer = new Planina("Cer", "Srbija", 689);
        RekreativniPlaninar a = new RekreativniPlaninar(1, 12, "Petar", "Petrovic", 12, "A", 850);
        RekreativniPlaninar b = new RekreativniPlaninar(2, 8, "Pera", "Petrovic", 6, "A", 1269);
        RekreativniPlaninar c = new RekreativniPlaninar(3, 29, "Ivan", "Petrovic", 24, "A", 423);

        Alpinista d = new Alpinista(4,22, "Andrej", "Andrejevic", 26);
        Alpinista e = new Alpinista(5,8, "Anda", "Andrejevic", 2);
        Alpinista f = new Alpinista(6,22, "Dragan", "Andrejevic", 9);
        ArrayList<Planinar> p = new ArrayList<>();

        p.add(a);
        p.add(b);
        p.add(c);
        p.add(d);
        p.add(e);
        p.add(f);

        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
            System.out.println(p.get(i).uspesanUspon(cer));
            System.out.println("--------------");
        }
        System.out.println("--------------");
        double sum = 0;
        for (int i = 0; i < p.size(); i++) {
            sum += p.get(i).clanarina();
        }
        System.out.println("Ukupna clanarina od " + p.size() + " je: " + sum);


    }
}
