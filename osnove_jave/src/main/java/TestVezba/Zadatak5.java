package TestVezba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Zadatak5 {
    public static void main(String[] args) {


        List<Integer> igrano = new ArrayList<>();
        igrano.addAll(Arrays.asList(1, 2, 3, 45, 31, 12, 5));
        List<Integer> izvuceno = new ArrayList<>();
        izvuceno.addAll(Arrays.asList(3, 2, 1, 31, 45, 12, 5));
        int uslvPetlje = 0;
        for (int i = 0; i < igrano.size(); i++) {

            if (uporedjivanje(igrano.get(i), izvuceno)) {
                uslvPetlje++;
            } else {
                uslvPetlje = 0;
            }
        }
        if (uslvPetlje == igrano.size()) {
            System.out.println("Ovo jed dobitna kombinacija");
        } else {
            System.out.println("Kombinacija nije dobitna");
        }
    }


    static boolean uporedjivanje(int igran, List<Integer> izvucen) {
        boolean uporedi = false;
        for (int i = 0; i < izvucen.size(); i++) {
            if (igran == izvucen.get(i)) {
                return uporedi = true;
            }

        }
        return false;
    }
}