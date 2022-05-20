package Dan19_05;

public class MainFacebookPost {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();
        post1.imeObjave = "Mile";
        post1.prezimeObjave = "Golja";
        post1.imeUpuceno = "Marko";
        post1.prezimeUpuceno = "Milosevic";
        post1.tekst = "Srecan rodjendan";
        post1.brLajkova = 0;
        post1.brojDeljenja = 0;
        post1.disLike();
        post1.like();
        post1.share();
        post1.share();
        post1.stampaj();
        System.out.println();
        FacebookPost post2 = new FacebookPost();
        post2.imeObjave = "Mile";
        post2.prezimeObjave = "Golja";
        post2.imeUpuceno = "Cveti";
        post2.prezimeUpuceno = "Saulic";
        post2.tekst = "Srecan divan dan";
        post2.brLajkova = 0;
        post2.brojDeljenja = 0;
        post2.like();
        post2.like();
        post2.like();
        post2.share();
        post2.share();
        post2.stampaj();

    }
}
