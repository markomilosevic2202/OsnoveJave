package Dan19_05;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("Naziv: " + naziv);
        System.out.println("Cena: " + cena);
        System.out.println("Tezina: " + tezina);
    }

    public void povecajCenu(double povecanje) {
        this.cena = this.cena + povecanje;

    }

    public double vratiCenuSaPopustom(double popust) {
        return this.cena - (this.cena / 100 * popust);
    }

    public double racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina > 100 && this.tezina <= 500) {
            return 400;
        }
        return 1000;
    }
}
