package Domaci24_05;

public class ZeleniKarton {
    private String imePrezime;
    private int brIndeksa;
    private String nazivPredmeta;
    private String profesor;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String imePrezime, int brIndeksa,
                        String nazivPredmeta, String profesor, int ocena) {
        this.imePrezime = imePrezime;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean polozenIspit(){
        if(this.ocena > 5){
            return true;
        }
        return false;
    }
    public void stampa(){

        System.out.println(String.format("Naziv predmeta: %s - %d",this.nazivPredmeta,this.ocena));
        System.out.println("Student: " + this.imePrezime + " - " + brIndeksa);
        System.out.println("Ime i prezime profesora: " + this.profesor);
        System.out.println();
    }
}
