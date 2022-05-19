package Dan18_05;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        SmartAirConditioning prva = new SmartAirConditioning();
        prva.marka = "Beko";
        prva.maxTemp = 35;
        prva.minTemp = 18;
        prva.mod = "Grejanje";
        prva.stampaj(prva.marka, prva.maxTemp, prva.minTemp, prva.mod);

        SmartAirConditioning druga = new SmartAirConditioning();
        druga.marka = "Gorenje";
        druga.maxTemp = 34;
        druga.minTemp = 19;
        druga.mod = "Hladjenje";
        druga.stampaj(druga.marka, druga.maxTemp, druga.minTemp, prva.mod);
    }
}
