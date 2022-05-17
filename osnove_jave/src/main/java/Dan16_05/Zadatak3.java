package Dan16_05;

public class Zadatak3 {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                zvezdica();
            }
            System.out.println();
        }
        }


    static void zvezdica() {
        System.out.print("* ");
    }
}
