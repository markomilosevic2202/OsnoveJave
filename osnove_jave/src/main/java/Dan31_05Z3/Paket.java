package Dan31_05Z3;

public class Paket {
    protected String nazivPaketa;
    protected String imePrezimeKorisnik;
    protected double mesecnaCena;
    protected int ugovornaObaveza;
    protected double brzinaNetaDownload;
    protected double brzinaNetaUpload;

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public Paket() {
    }

    public Paket(String nazivPaketa, String imePrezimeKorisnik, double mesecnaCena, int ugovornaObaveza, double brzinaNetaDownload, double brzinaNetaUpload) {
        this.nazivPaketa = nazivPaketa;
        this.imePrezimeKorisnik = imePrezimeKorisnik;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.brzinaNetaDownload = brzinaNetaDownload;
        this.brzinaNetaUpload = brzinaNetaUpload;
    }

    public String getImePrezimeKorisnik() {
        return imePrezimeKorisnik;
    }

    public double getMesecnaCena() {
        return mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public double getBrzinaNetaDownload() {
        return brzinaNetaDownload;
    }

    public double getBrzinaNetaUpload() {
        return brzinaNetaUpload;
    }

    public void setMesecnaCena(double mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }
    public void produziUgovor(){
        this.ugovornaObaveza = this.ugovornaObaveza + 12;
    }
    public double meseciPoDinar(){
        return 0;
    }
    public void stampaj(){
        System.out.println(this.imePrezimeKorisnik);
        System.out.println(this.nazivPaketa + " - " + this.brzinaNetaDownload + "/" + this.brzinaNetaUpload);

    }
}
