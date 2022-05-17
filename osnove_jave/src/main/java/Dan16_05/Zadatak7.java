package Dan16_05;

public class Zadatak7 {

    public static void main(String[] args) {
        suprotno(10);
        suprotno(-11);
        System.out.println(suprotno(10));
        System.out.println(suprotno(-11));
    }

    static int suprotno(int n) {
        return n * (-1);
    }
}
//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11