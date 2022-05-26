package Dan24_05;

public class MainZoom {
    public static void main(String[] args) {


    Korisnik korisnik1 = new Korisnik();
    korisnik1.setIme("Milan");
    korisnik1.setPrezime("Jovanovic");
    Korisnik korisnik2 = new Korisnik();
    korisnik2.setIme("Marko");
    korisnik2.setPrezime("Milosevic");
    ZoomCall zoomCall1 = new ZoomCall("15447884","asdasda",korisnik1);
    zoomCall1.setGuest(korisnik2);
    zoomCall1.stampa();
    korisnik1.licenca(100);
    System.out.println();
    zoomCall1.stampa();
}   }
