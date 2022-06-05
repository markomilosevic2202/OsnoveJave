package Domaci03_06Z1;

public class Main {
    public static void main(String[] args) {


    SuperKartica s1 = new SuperKartica(11445,"Marko Milosevic" , 100);
    Tetrapak t1 = new Tetrapak("1545", "Sok", 100, 110, true,500);
    Tetrapak t2 = new Tetrapak("2445", "Mleko", 1000, 1100, false,300);
    StaklenaAmbalaza sa1 = new StaklenaAmbalaza("154956", "Pivo", 500,100,100,true,200);
    Korpa k1 = new Korpa();
    k1.dodajAmbalazu(t1);
    k1.dodajAmbalazu(t2);
    k1.dodajAmbalazu(sa1);
    k1.stampa();

}}
