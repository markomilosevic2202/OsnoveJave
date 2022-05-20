package Dan20_05;

import Dan20_05.FacebookPost;

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
        FacebookPost post2 = new FacebookPost("Dragan","Micanovic","Stane",
                                              "Dolanc","Srecan rodjendan Stane . . .");

        post2.like();
        post2.like();
        post2.like();
        post2.share();
        post2.share();
        post2.stampaj();

    }
}
