package Dan30_05;

public class MainInstagram {
    public static void main(String[] args) {


        InstagramUser korisnik1 = new InstagramUser("mile", "Mile Ilic", "dsafdsaf@sdsd.com");
        InstagramUser korisnik2 = new InstagramUser("zare", "Zaharije Trnavcevic", "svscvc@dsfdsf.com");
        InstagramTag tag1 = new InstagramTag(400, 500, korisnik1);
        InstagramTag tag2 = new InstagramTag(500, 300, korisnik2);
        InstagramImage img1 = new InstagramImage("500 * 400", "www.ssfsfs.asfa.com");
        img1.dodajTag(tag1);
        img1.dodajTag(tag2);
        InstagramImage img2 = new InstagramImage("600 * 400", "www.sffasf.sa.com");
        img2.dodajTag(tag1);
        img2.dodajTag(tag2);
        InstagramPost post1 = new InstagramPost();
        post1.dodajSliku(img1);
        post1.dodajSliku(img2);
        post1.stampaj();


    }
}
