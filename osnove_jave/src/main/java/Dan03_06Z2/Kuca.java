package Dan03_06Z2;

public class Kuca extends Objekat{

     private int brojClanova;

    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porezObjekta() {
        return this.povrsina * this.koeficijent();
    }

    @Override
    public void stampa() {
        System.out.println(this.adresa + " - " + this.povrsina + " - " +
                           this.zona + " - Br clanova: " + this.brojClanova+ "Porez: " +this.porezObjekta());
    }
}
