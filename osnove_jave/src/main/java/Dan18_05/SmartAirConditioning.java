package Dan18_05;

public class SmartAirConditioning {

    public String marka;
    public int maxTemp;
    public int minTemp;
    public String mod;

    public void stampaj(String marka, int maxTemp, int minTemp, String mod) {
        System.out.print("Marka klime je " + marka + " Maksimalna temperatura je: ");
        System.out.println(" Minimalna temperatura je: " + minTemp + " Mod u kom klima radi: " + mod);
    }
}
