package Dan05_06Z1;

public class Main {
    public static void main(String[] args) {
        Planina sutjeska = new Planina("Sutjeska", "Bosna", 1400);
        PlaninarskiDom p1 = new PlaninarskiDom("Sutjeska", 1955);
        p1.uclaniPlaninara(new Alpinista(12, "Mitar Miric", 5));
        p1.uclaniPlaninara(new Alpinista(13, "Zoran Bajagic", 4));
        p1.uclaniPlaninara(new RekreativniPlaninar(14, "Dragan Jovanovic", 10, "Hercegovacki", 2000));
        p1.stampa();
        p1.izbaciIzDoma(13);
        p1.stampa();
        System.out.println("Broj uspesnih penjanja: " + p1.brPlaninaraUspesnih(sutjeska));

    }
}
//(10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i
// nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.