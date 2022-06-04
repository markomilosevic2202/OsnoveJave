package Dan02_06Z3;

public class VideoPlayer {
    private int duzina;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzina, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampa(){
        System.out.println("Trenutno vreme: " + this.trenutnoVreme);
        System.out.println("JacinaZvuka" + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.duzina);

    }
}
