package Dan16_05;

public class Zadatak4 {
    public static void main(String[] args) {
        racunaj(6,3);
    }
    static void racunaj(int a, int b){
        System.out.println("zbir brojeva je: " + (a+b));
        System.out.println("razlika brojeva je: " + (a-b));
        System.out.println("Kolicni brojev je: " + (a/b));
        System.out.println("proizvod brojeva je " + (a*b));
    }
}
//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.