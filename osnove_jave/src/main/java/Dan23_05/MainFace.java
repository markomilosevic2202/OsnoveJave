package Dan23_05;

public class MainFace {
    public static void main(String[] args) {
        Korisnik korisnik1 = new Korisnik("Marko", "Milosevic");
        FacebookPost post1 = new FacebookPost("dsfdsfsdcsd", korisnik1);
        post1.stampa();
        Korisnik korisnik2 = new Korisnik();
        korisnik2.setIme("Milan");
        korisnik2.setPrezime("Mladenovic");

        FacebookPost post2 = new FacebookPost();
        post2.setKorisnik(korisnik2);
        post2.setOpis("SSFSAFasfasdasdasd");
        post2.stampa();

        FacebookPost post3 = new FacebookPost();
        post3.setKorisnik(korisnik2);
        post3.setOpis("SFSDFSDF");
        post3.stampa();


    }
}
