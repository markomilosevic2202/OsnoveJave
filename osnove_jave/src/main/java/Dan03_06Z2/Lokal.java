package Dan03_06Z2;

public class Lokal extends Objekat{
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }


    @Override
    public double porezObjekta() {
        return this.koeficijent() * this.povrsina * 1.3;
    }

    @Override
    public void stampa() {
        System.out.println(this.adresa + " - " + this.povrsina + " - " +
                this.zona + "Porez: " +this.porezObjekta());

    }
}
