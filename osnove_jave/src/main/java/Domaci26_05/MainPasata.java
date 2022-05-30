package Domaci26_05;

public class MainPasata {
    public static void main(String[] args) {
        Sastojak pesto = new Sastojak("Pesto" , 100);
        Sastojak kackavalj = new Sastojak("Kackavalj", 200);
        Sastojak sunka = new Sastojak("Sunka", 300);
        Sastojak mocarela = new Sastojak("Mocarela", 400);
        Pasta pestoPasata = new Pasta();
        pestoPasata.dodaj(pesto);
        pestoPasata.dodaj(kackavalj);
        pestoPasata.dodaj(sunka);
        pestoPasata.stampa();
        System.out.println();
        Pasta italijana = new Pasta();
        italijana.dodaj(kackavalj);
        italijana.dodaj(sunka);
        italijana.dodaj(mocarela);
        italijana.stampa();
        italijana.brisiSastojak(kackavalj);
        italijana.stampa();

    }
}
