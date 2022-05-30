package Domaci26_05;

public class HistoryPage {
    private String nazivStranice;
    private String link;
    private int satOtvaranja;
    private int minutOtvaranja;
    private String userName;
    private String pass;

    public HistoryPage() {
    }

    public HistoryPage(String nazivStranice, String link, int satOtvaranja, int minutOtvaranja, String userName, String pass) {
        this.nazivStranice = nazivStranice;
        this.link = link;
        this.satOtvaranja = satOtvaranja;
        this.minutOtvaranja = minutOtvaranja;
        this.userName = userName;
        this.pass = pass;
    }

    public String getNazivStranice() {
        return nazivStranice;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getSatOtvaranja() {
        return satOtvaranja;
    }

    public void setSatOtvaranja(int satOtvaranja) {
        this.satOtvaranja = satOtvaranja;
    }

    public int getMinutOtvaranja() {
        return minutOtvaranja;
    }

    public void setMinutOtvaranja(int minutOtvaranja) {
        this.minutOtvaranja = minutOtvaranja;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }
    public void kredencijale(String userName, String pass){
        this.userName = userName;
        this.pass = pass;

    }
    public void obrisiKolacice(){
        this.userName = null;
        this.pass = null;
    }
    public void stampaj(){
        System.out.println(this.satOtvaranja + " : " + this.minutOtvaranja + " " + this.nazivStranice + " " + this.link);
    }
}
