package TestJavaOsnove;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1, 5, 8, 6, 8, 5, 2, 6, 2, 5, 3, 3, 2, 45, 6, 47, 4, 3, 25, 4, 36, 32, 14, 22, 25));
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + ", ");
            if ((i % 5) == 4) {
                System.out.println();
            }
        }
        System.out.println("Unesite red koji se sabira");
        int red = s.nextInt();
        for (int i = (red - 1); i < lst.size(); i++) {

            sum = sum + lst.get(i);
            i = i + 4;
        }
        System.out.println("Suma je: " + sum);

    }
}
