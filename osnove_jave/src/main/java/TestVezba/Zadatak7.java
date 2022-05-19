package TestVezba;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int vrednost = 75;
        System.out.println("Unesite akciju: ");
        String akcija = s.next();
        while (!akcija.equals("p")){
            if(akcija.equals("u") && vrednost < 90){
                vrednost = vrednost + 10;
            } else if (akcija.equals("d") && vrednost > 10) {
                vrednost = vrednost - 10;
            } else if (akcija.equals("m")) {
                vrednost = 0;
            }
            else {
                System.out.println("Nevalidan unos");
            }
            System.out.println("Zvuk je: "+vrednost);
            System.out.println("Unesite akciju: ");
            akcija = s.next();
        }
        System.out.println("Muzika krece . . . Jacina zvuka je: " + vrednost);
    }
}