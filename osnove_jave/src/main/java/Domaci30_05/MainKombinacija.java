package Domaci30_05;

public class MainKombinacija {
    public static void main(String[] args) {
        Kombinacija dobitna = new Kombinacija("4887", 5, 8 , 9, 15, 18, 30, 35 );
        Listic listic1 = new Listic();
        listic1.dodajKombinaciju(new Kombinacija("4576",5,8,9,15,18,30,35));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.dodajKombinaciju(new Kombinacija("4578",4,5,7,12,16,19,28));
        listic1.stampa();
        if(listic1.proveraSvihKombinacija(dobitna)){
            System.out.println("B I N G O");
        }
        else {
            System.out.println("Nema dobitka");
        }
    }


    }

