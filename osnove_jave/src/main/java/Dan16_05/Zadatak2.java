package Dan16_05;

public class Zadatak2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ime();
            prezime();
        }
    }

    static void ime() {
        System.out.print("Marko ");
    }

    static void prezime() {
        System.out.print("Milosevic!");
        System.out.println();
    }
}
