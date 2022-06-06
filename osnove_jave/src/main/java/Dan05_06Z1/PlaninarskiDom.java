package Dan05_06Z1;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari = new ArrayList<>();

    public PlaninarskiDom(String naziv, int godinaOsnivanja) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;

    }

    public PlaninarskiDom() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public void uclaniPlaninara(Planinar planinar) {
        this.planinari.add(planinar);
    }

    public int brPlaninaraUspesnih(Planina planina) {
        int brUspesnih = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).uspesanUspon(planina)) {
                brUspesnih++;
            }
        }
        return brUspesnih;
    }

    public void izbaciIzDoma(int id) {
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).getIdPlaninara() == id) {
                this.planinari.remove(i);
            }
        }

    }

    public void stampa() {
        System.out.println(this.naziv + " - Godina osnivanja " + this.godinaOsnivanja + " Ukupna Clanarina: " + mesecnaClanarina());
        for (int i = 0; i < this.planinari.size(); i++) {
            this.planinari.get(i).stampa();
        }
    }

    public double mesecnaClanarina() {
        double mesecnaClanarina = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            mesecnaClanarina += this.planinari.get(i).cenaClanarine();
        }
        return mesecnaClanarina;
    }
}
//●	naziv doma
//●	godinu kada je osnovan.
//●	članove doma koji su planinari (klasa vodi računa o nizu)
//Dok od javnih:
//●	default-ni konstuktor i konstuktor koji postavlja sve parametre
//●	gettere i settere koji su potrebni
//●	metodu učlani planinara, koja dodaje planinara u niz
//●	metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
//●	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//●	metodu koja štampa podatke o domu i o svim članovima doma
//●	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//(10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.