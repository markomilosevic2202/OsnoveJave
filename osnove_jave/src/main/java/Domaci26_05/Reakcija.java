package Domaci26_05;

public class Reakcija {
    private String reakcija;
    private String imePrezime;

    public Reakcija() {
    }

    public Reakcija(String reakcija, String imePrezime) {
        this.reakcija = reakcija;
        this.imePrezime = imePrezime;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
