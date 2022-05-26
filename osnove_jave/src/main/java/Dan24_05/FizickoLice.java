package Dan24_05;

public class FizickoLice {
    private String imePrezime;
    private int brLicne;
    private int jmbg;
    private boolean kupovao;

    public FizickoLice(int jmbg) {
        this.jmbg = jmbg;
    }

    public FizickoLice(String imePrezime, int brLicne, int jmbg, boolean kupovao) {
        this.imePrezime = imePrezime;
        this.brLicne = brLicne;
        this.jmbg = jmbg;
        this.kupovao = kupovao;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrLicne() {
        return brLicne;
    }

    public void setBrLicne(int brLicne) {
        this.brLicne = brLicne;
    }

    public int getJmbg() {
        return jmbg;
    }



    public boolean getKupovao() {
        return kupovao;
    }

    public void setKupovao(boolean kupovao) {
        this.kupovao = kupovao;
    }
    public void stampa(){
        System.out.println("Ime i Prezime: " + this.imePrezime + " Br licne karte: " + this.brLicne);

    }
}
