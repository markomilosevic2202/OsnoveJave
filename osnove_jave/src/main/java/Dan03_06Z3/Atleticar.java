package Dan03_06Z3;

public abstract class Atleticar {
    private String imePrezime;
    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String imePrezime, double rezultat) {
        this.imePrezime = imePrezime;
        this.rezultat = rezultat;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean bolji(Atleticar a2);
    public abstract void stampa();
}
