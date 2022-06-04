package Dan03_06Z2;

public abstract class Objekat  {
    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekat(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public Objekat() {
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
    public double koeficijent(){
        if (this.zona ==1){
            return 1.4;
        } else if (this.zona == 2) {
            return 1.1;
        }
        else {
            return 1.05;
        }
    }
    public abstract double porezObjekta();
    public abstract void stampa();
}
