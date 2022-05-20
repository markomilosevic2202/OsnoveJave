package Dan20_05;

public class MainRadnik {
    public static void main(String[] args) {
        Radnik radnik1 = new Radnik("1245988730038","Mile",
                "Prezime", 2,3,25);
        System.out.println("Minuli rad je: " + radnik1.minuliRad());
        System.out.println("Koeficijen strucne spreme: " + radnik1.koeficijentSlozenosti());
        System.out.println("Plata je: " + radnik1.plata());
        if(radnik1.kreditnoSposoban()){
        System.out.println("Radnik je kreditno sposoban");}
        else {
            System.out.println("Radnik nije kreditno sposoban");
        }
        System.out.println("Broj slobodnih dana je: " + radnik1.brSlobodnihDana());
        System.out.println();
        Radnik radnik2 = new Radnik("1243254653730038","Ilija",
                "Cvorovic", 1,7,14);
        System.out.println("Minuli rad je: " + radnik2.minuliRad());
        System.out.println("Koeficijen strucne spreme: " + radnik2.koeficijentSlozenosti());
        System.out.println("Plata je: " + radnik2.plata());
        if(radnik1.kreditnoSposoban()){
            System.out.println("Radnik je kreditno sposoban");}
        else {
            System.out.println("Radnik nije kreditno sposoban");
        }
        System.out.println("Broj slobodnih dana je: " + radnik2.brSlobodnihDana());
    }
}
