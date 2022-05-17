package Dan16_05;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int x = s.nextInt();
        apsolutna(x);

    }

    static void apsolutna(int x) {
        if (x > 0) {
            System.out.println();
        } else {
            System.out.println(x * (-1));
        }
    }
}
