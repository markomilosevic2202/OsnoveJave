package Domaci31_05Z1;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tipTrenera;

    public Trener() {
    }

    public Trener(String imePrezime, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampa() {
        System.out.println("Trener:");
        super.stampa();
        System.out.println("Godine iskustva: " + this.godineIskustva + "Tip: " + this.tipTrenera);
    }
}
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.