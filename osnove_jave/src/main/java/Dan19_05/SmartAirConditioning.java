package Dan19_05;

public class SmartAirConditioning {

    public String marka;
    public double potrosnjaDokHladi;
    public double potrosnjaDokGreje;
    public double izabranaTemp;
    public boolean hladi;

    public void stampa() {
        System.out.println("Marka klime je " + this.marka);
        System.out.println("Potrosnja klime dok hladi je: " + this.potrosnjaDokHladi);
        System.out.println("Potrosnja klime dok greje je: " + this.potrosnjaDokGreje);
        System.out.println("Izabrana temperatura je: " + this.izabranaTemp);
        if (hladi) {
            System.out.println("Trenutni mod je hladjenje");
        } else {
            System.out.println("Trenutni mod je grejanje");
        }
    }

    public double mesecnaPotrosnja() {
        if (this.hladi) {
            return (30 * 15 * this.potrosnjaDokHladi);
        } else {
            return (30 * 15 * this.potrosnjaDokGreje);
        }
    }

    public double potrosnjaCena() {
        return (350 * 6) + this.mesecnaPotrosnja() - 350 * 9;
        //nisam imao vremena da trazim optimalno resenje znam da nije dobro
    }
}
