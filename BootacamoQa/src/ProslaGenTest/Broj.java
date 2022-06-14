package ProslaGenTest;

public class Broj {
    private String tekstualniKod;
    private String pozivni;
    private String broj;
    private boolean fiksnibroj;

    public Broj(String tekstualniKod, String pozivni, String broj, boolean fiksnibroj) {
        if (tekstualniKod.length() != 3) {
            System.out.println("Nije unet validan kod!");
        } else
            this.tekstualniKod = tekstualniKod;
        if (pozivni.length() != 2) {
            System.out.println("Nije unet validan pozivni broj!");
        } else
            this.pozivni = pozivni;
        if (broj.length() == 7 || broj.length() == 8) {
            this.broj = broj;
        } else
            System.out.println("Nije unet validan broj!");
        this.fiksnibroj = pozivni.equals("11");
    }

    public String getTekstualniKod() {
        return tekstualniKod;
    }

    public void setTekstualniKod(String tekstualniKod) {
        if (tekstualniKod.length() != 3) {
            System.out.println("Nije unet validan kod!");
        } else
            this.tekstualniKod = tekstualniKod;
    }

    public String getPozivni() {
        return pozivni;
    }

    public void setPozivni(String pozivni) {
        if (pozivni.length() != 2) {
            System.out.println("Nije unet validan pozivni broj!");
        } else
            this.pozivni = pozivni;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        if (broj.length() == 7 || broj.length() == 8) {
            this.broj = broj;
        } else
            System.out.println("Nije unet validan broj!");
    }

    public boolean isFiksnibroj() {
        return fiksnibroj;
    }

    public void setFiksnibroj(boolean fiksnibroj) {
        this.fiksnibroj = fiksnibroj;
    }

    private static boolean proveriDaLiStringSadrziSamoNumerike(String s) {
        return s.matches("\\d+");
    }

    private static boolean proveriBroj(String tekstualniKod, String pozivni, String broj) {
        int tK = tekstualniKod.length();
        int poz = pozivni.length();
        int br = broj.length();
        return (tekstualniKod != null && tK == 3 && proveriDaLiStringSadrziSamoNumerike(tekstualniKod) &&
                pozivni != null && poz == 2 && proveriDaLiStringSadrziSamoNumerike(pozivni) &&
                broj != null && (br >= 7 && br <= 8) && proveriDaLiStringSadrziSamoNumerike(broj));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(getTekstualniKod()).append(" ").append(getPozivni()).append(" ").append(broj);
        return sb.toString();

    }
}
