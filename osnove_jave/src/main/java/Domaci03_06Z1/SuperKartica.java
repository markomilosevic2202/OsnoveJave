package Domaci03_06Z1;

public class SuperKartica {
    private int brKartice;
    private String imePrezime;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(int brKartice, String imePrezime, double popust) {
        this.brKartice = brKartice;
        this.imePrezime = imePrezime;
        this.popust = popust;
    }

    public int getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(int brKartice) {
        this.brKartice = brKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println(this.brKartice + " - " + this.imePrezime);
    }
}
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)