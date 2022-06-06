package Dan05_06Z1;

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maxUspon;

    public RekreativniPlaninar(int idPlaninara, String imePrezime, int tezinaOpreme, String nazivOkruga, int maxUspon) {
        super(idPlaninara, imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    @Override
    public void stampa() {
        System.out.println("Rekreativac " + this.idPlaninara + " - " + this.imePrezime + " - Okrug: " + this.nazivOkruga);
    }

    @Override
    public double cenaClanarine() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisina() < (this.maxUspon - this.tezinaOpreme * 50)) {
            return true;
        } else {
            return false;
        }
    }
}
//) Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//●	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//●	naziv okruga odakle je rekreativni planinar.
//●	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//●	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//●	rekeativci placaju clanarinu u iznosu od 1000 rsd
//●	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)