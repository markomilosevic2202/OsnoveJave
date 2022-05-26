package Dan24_05;

public class Korisnik {
    private String ime;
    private String prezime;
    private String tipLicence;

    public Korisnik() {
        this.tipLicence = "basic";
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

    public String getTipLicence() {
        return tipLicence;
    }
    public void licenca(int uplata){
        if (uplata == 100){
            this.tipLicence = "pro";
        } else if (uplata == 150) {
            this.tipLicence = "premium";
        }
    }
    public void vratiBasic(){
        this.tipLicence = "basic";
    }
    public int maxDuzina(){
        if(this.tipLicence == "basic"){
            return 40;
        } else if (this.tipLicence == "pro") {
            return 240;
        }
        else {
            return 1440;
        }
    }
    public void stampa(){
        System.out.println("Ime: " + this.ime + " Prezime: " + this.prezime);
    }

}
