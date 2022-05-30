package Domaci24_05;

public class MainSporet {
    public static void main(String[] args) {


        Ringla ringla1 = new Ringla(true, 1000);
        Ringla ringla2 = new Ringla(false, 800);
        Ringla ringla3 = new Ringla(false, 900);
        Ringla ringla4 = new Ringla(false,1200);
        ElektricniSporet sporet1 = new ElektricniSporet("Bosch", 5, 3,
                ringla1, ringla2, ringla3, ringla4);
        sporet1.getDd().pojacaj();
        sporet1.getDd().pojacaj();
        sporet1.getDd().pojacaj();
        sporet1.getDd().pojacaj();
        sporet1.getDl().pojacaj();
        sporet1.getDl().iskljuci();
        sporet1.stamaj();
        System.out.println("Potrosnja je: " + sporet1.racunajPotrosnju(1,2,3,4));

    }
}