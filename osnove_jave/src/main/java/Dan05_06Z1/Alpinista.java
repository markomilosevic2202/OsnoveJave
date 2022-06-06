package Dan05_06Z1;

public class Alpinista extends Planinar {
    private int brPoena;

    public Alpinista(int idPlaninara, String imePrezime, int brPoena) {
        super(idPlaninara, imePrezime);
        this.brPoena = brPoena;
    }

    @Override
    public void stampa() {
        System.out.println("Alpinista " + this.idPlaninara + " - " + this.imePrezime + " Broj poena: " + this.brPoena);
    }

    @Override
    public double cenaClanarine() {
        return 1500 - this.brPoena * 50;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisina() < 4000) {
            return true;
        } else {
            return false;
        }
    }
}
//(20 poena) Kreirati klasu Alpinista koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena
// je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do
// 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se
// ispisuju u formatu:
//Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)