package Test06_06;

public class Main {
    public static void main(String[] args) {

        InstagramStory s1 = new InstagramStory(new InstagramUser("mile" , "Mile Golja"), "www.picture.com/picture");
        InstagramLocationAddOn l1 = new InstagramLocationAddOn(1,100,50,200,300,"Prokuplje");
        l1.smanjiDimenziju(30,40);
        s1.dodajDodatak(new InstagramLocationAddOn(1,100,50,200,300,"Nis"));
        s1.dodajDodatak(new InstagramMentionAddOn(2,200,100,200,200,new InstagramUser("dragce" , "Dragan Jovanovic")));
        s1.dodajDodatak(new InstagramMentionAddOn(3,200,10,400,100,new InstagramUser("pera" , "Pera Peric")));
        s1.dodajDodatak(new InstagramMentionAddOn(4,100,40,200,500,new InstagramUser("miki" , "Miki Mikic")));
        s1.dodajPregled(new InstagramUser("mile" , "Mile Golja"));
        s1.dodajPregled(new InstagramUser("miki" , "Miki Mikic"));
        s1.dodajPregled(new InstagramUser("zare" , "Zarko Krivokuca"));
        s1.dodajPregled(new InstagramUser("zare" , "Zarko Krivokuca"));
        s1.stampa();// implementirana u stampi br pregleda da se ne bi zvao iz maina
        s1.stampaPregleda();
        s1.setLinkSwipUp("www.sdsds.com");
        s1.stampa();
    }
}
//(15 poena) U glavnom programu kreirati jedan instagram stori sa jednom postavljenom  lokacijom, sa bar 3 tagovanih osoba i bar 3 korisnika koja su pogledala stori a zatim isprobati sve metode objekata.
//Napomena: probajte story sa i bez swipe up linkom