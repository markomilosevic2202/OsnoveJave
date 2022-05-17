package TestVezba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Zadatak5 {
    public static void main(String[] args) {


        List<Integer> igrano = new ArrayList<>();
        igrano.addAll(Arrays.asList(1, 2, 3));
        List<Integer> izvuceno = new ArrayList<>();
        izvuceno.addAll(Arrays.asList(3, 2, 1));
        boolean uslvPetlje = true;
       while (uslvPetlje ){
            uporedjivanje(igrano.get(1), izvuceno);
            }

        }


    static boolean uporedjivanje(int igran, List<Integer> izvucen){
        boolean uporedi = false;
        for (int i = 0; i < izvucen.size(); i++) {
            if(igran == izvucen.get(i)){
                return uporedi = true;
            }


        } return uporedi;
    }
}