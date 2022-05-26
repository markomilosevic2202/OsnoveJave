package Domaci24_05;

public class Transakcija {
    private int id;
    private Racun sa;
    private Racun na;

    public Transakcija() {
    }

    public Transakcija(int id, Racun sa, Racun na) {
        this.id = id;
        this.sa = sa;
        this.na = na;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getSa() {
        return sa;
    }

    public void setSa(Racun sa) {
        this.sa = sa;
    }

    public Racun getNa() {
        return na;
    }

    public void setNa(Racun na) {
        this.na = na;
    }
    private double provizja(double prenos){
        return (prenos < 4500) ? 45 : (prenos/100);

    }
    public void izvrsiTransakciju(double prenos){
        if(this.sa.getTrenutnoStanje() >= (prenos+provizja(prenos))){
        sa.promenaStanja((prenos )+ provizja(prenos));
        na.promenaStanja(-prenos);}
        else {
            System.out.println("Nemate dovoljno sredstava");
        }

    }
    public void stampaj(){
        System.out.println("Id: " + this.id);
        System.out.println("Racun sa: " + this.na.getImePrezime() + " - " + this.na.getBrRacuna());
        System.out.println("Racun na: " + this.sa.getImePrezime() + " - " + this.sa.getBrRacuna());
        System.out.println("Novo stanje uplatioca:");
        this.sa.stampa();
        System.out.println("Novo stanje primaoca:");
        this.na.stampa();

    }
}
