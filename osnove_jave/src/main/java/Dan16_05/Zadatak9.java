package Dan16_05;

public class Zadatak9 {
    public static void main(String[] args) {

        System.out.println(konverzija("I"));
    }

    static int konverzija(String x) {
        int rimskiBroj;
        if (x.equals("I")) {
            return 1;
        } else if (x.equals("II")) {
            return 2;
        } else if (x.equals("III")) {
            return 3;
        } else if (x.equals("IV")) {
            return 4;
        } else if (x.equals("V")) {
            return 5;
        } else if (x.equals("VI")) {
            return 6;
        } else if (x.equals("VII")) {
            return 7;
        } else if (x.equals("VIII")) {
            return 8;
        }
        return 9;
    }

}


//9.Zadatak
//Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//6 - VI
//7 - VII
//8 - VIII
//9 - IX
//10 - X
//
//Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//Ako se unese VIII vraca se 8.
//
//VIII => 8