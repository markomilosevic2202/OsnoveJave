package Dan24_05;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSastojci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    ArrayList<Sastojak> kolac = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Unesit naziv i cenu");
            kolac.add(i,new Sastojak(s.next(),s.nextInt()));

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(kolac.get(i).getNazivSastojaka());
            System.out.println(kolac.get(i).getCena());
        }


}}
