package TestJavaOsnove;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite password");

        Boolean uslov = true;
        while (uslov) {
            String pass = s.next();
            if (pass.length() > 7 && (pass.contains("#") || pass.contains("@"))) {
                uslov = false;
            } else {
                uslov = true;
                System.out.println("Lozinka nije validna");
            }
        }
        System.out.println("Lozinka je validna");
    }
}