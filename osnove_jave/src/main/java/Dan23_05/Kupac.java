package Dan23_05;

public class Kupac {
    private String ime;
    private String prezime;
    private Kartica kartica;

    public Kupac() {
    }

    public Kupac(String ime, String prezime, Kartica kartica) {
        this.ime = ime;
        this.prezime = prezime;
        this.kartica = kartica;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Kartica getKartica() {
        return kartica;
    }

    public void setKartica(Kartica kartica) {
        this.kartica = kartica;
    }
    public void stampaj(){
        System.out.println("Ime: " + this.ime + " Prezime: "+ this.prezime +
                this.kartica.getBrKartice());
    }
}
