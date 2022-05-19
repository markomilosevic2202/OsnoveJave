package TestJavaOsnove;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite major verziju instalirane aplikacije");
        double major = s.nextDouble();
        System.out.println("Unesite major verziju instalirane aplikacije");
        double minor = s.nextDouble();
        double instalirana = major +(minor/10);
        System.out.println("Instalirana verzija je: "+instalirana);
        System.out.println("Unesite major verziju nove instalirane aplikacije");
        double majorNova = s.nextDouble();
        System.out.println("Unesite major verziju nove instalirane aplikacije");
        double minorNova = s.nextDouble();
        double nova = majorNova +(minorNova/10);
        System.out.println("Nova verzija je "+nova);
        if (instalirana == nova){
            System.out.println("Imate najnoviju verziju");
        }
        else {
            System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");

        }
    }
}
