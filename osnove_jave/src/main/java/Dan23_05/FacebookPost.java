package Dan23_05;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;

    public FacebookPost() {
    }

    public FacebookPost(String opis, Korisnik korisnik) {
        this.korisnik = korisnik;
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public void stampa() {
        korisnik.stampa();
        System.out.println(this.opis);
    }
}
