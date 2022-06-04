package Dan03_06Z2;

public class Zgrada extends Objekat{
    public Zgrada(String adresa, double povrsina, int zona, int brStanova) {
        super(adresa, povrsina, zona);
        this.brStanova = brStanova;
    }

    public int getBrStanova() {
        return brStanova;
    }

    public void setBrStanova(int brStanova) {
        this.brStanova = brStanova;
    }

    private int brStanova;

    @Override
    public double porezObjekta() {
        return this.koeficijent() * this.povrsina * this.brStanova;
    }

    @Override
    public void stampa() {
        System.out.println(this.adresa + " - " + this.povrsina + " - " +
                this.zona + " - Br stanova: " + this.brStanova + "Porez: " +this.porezObjekta());

    }
}
