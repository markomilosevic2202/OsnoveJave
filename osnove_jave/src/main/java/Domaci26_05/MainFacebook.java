package Domaci26_05;

import Dan23_05.FacebookPost;

public class MainFacebook {
    public static void main(String[] args) {
        Reakcija reakcija1 = new Reakcija("Smajli", "Miljan Miljanic");
        Reakcija reakcija2 = new Reakcija("Smajli", "Dragan Cvetkovic");
        Reakcija reakcija3 = new Reakcija("Smajli","Jovan Jovanovic");
        Reakcija reakcija4 = new Reakcija("Like", "Miljan Stojanovic");
        Reakcija reakcija5 = new Reakcija("Like", "Dragan Cvetkovic");
        FaceBookPost post1 = new FaceBookPost("Dragan Jovanovic", "Amin");
        post1.dodajReakciju(reakcija1);
        post1.dodajReakciju(reakcija2);
        post1.dodajReakciju(reakcija3);
        post1.dodajReakciju(reakcija4);
        post1.dodajReakciju(reakcija5);
        post1.stampa();



    }
}
