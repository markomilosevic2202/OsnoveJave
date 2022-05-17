package Dan16_05;

public class Zadatak8 {
    public static void main(String[] args) {
        System.out.println(provera(2,3,13));
    }
    static boolean provera(int x, int y, int z){
        return ((x*x)+(y*y)==z*z);
    }
}
//Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu
// trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c