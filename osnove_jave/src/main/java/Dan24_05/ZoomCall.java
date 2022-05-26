package Dan24_05;



public class ZoomCall {
    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String password, String link,Korisnik host) {
        this.password = password;
        this.link = link;
        this.host = host;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Korisnik getHost() {
        return host;
    }

    public void setGuest(Korisnik guest) {
        this.guest= guest;
    }

    public Korisnik getGuest() {
        return guest;
    }

public void stampa(){
    System.out.println("Zoom call: " + this.link);
    System.out.println("Pass: " + this.password);
    this.host.stampa();
    this.guest.stampa();
    System.out.println("Max duzina:" + this.host.maxDuzina());
}



}
