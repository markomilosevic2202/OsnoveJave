package Dan19_05;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.marka = "Samsung";
        samsung.potrosnjaDokHladi = 4;
        samsung.potrosnjaDokGreje = 6;
        samsung.izabranaTemp = 28;
        samsung.hladi = false;
        samsung.stampa();
        System.out.println(samsung.mesecnaPotrosnja());
        System.out.println(samsung.potrosnjaCena());
        System.out.println();

        SmartAirConditioning beko = new SmartAirConditioning();
        beko.marka = "Beko";
        beko.potrosnjaDokHladi = 3;
        beko.potrosnjaDokGreje = 5;
        beko.izabranaTemp = 26;
        beko.hladi = true;
        beko.stampa();
        System.out.println(beko.mesecnaPotrosnja());
        System.out.println(beko.potrosnjaCena());
    }
}
