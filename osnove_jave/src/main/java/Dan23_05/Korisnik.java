package Dan23_05;

public class Korisnik {
    private String ime;
    private String prezime;

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Korisnik() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void stampa() {
        System.out.println("Ime: " + ime + "Prezime: " + prezime);
    }
}
