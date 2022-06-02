package Domaci31_05Z2;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int br;
    private String pozicija;
    private ArrayList<Karton> kartoni = new ArrayList<>();
    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int br, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.br = br;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton) {
        this.kartoni.add(karton);
    }

    public int brZutih() {
        int brZutih = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")) {
                brZutih++;
            }

        }
        return brZutih;
    }

    public int brCrvenih() {
        int brCrvenih = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                brCrvenih++;
            }

        }
        return brCrvenih;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj zutih: " + this.brZutih() + " Broj crvenih: " + this.brCrvenih());
    }
}
