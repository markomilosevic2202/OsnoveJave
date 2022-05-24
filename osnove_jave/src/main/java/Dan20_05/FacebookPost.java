package Dan20_05;

public class FacebookPost {
    String imeObjave;
    String prezimeObjave;
    String imeUpuceno;
    String prezimeUpuceno;
    String tekst;
    int brLajkova;
    int brojDeljenja;

    public FacebookPost(String imeObjave, String prezimeObjave, String imeUpuceno,
                        String prezimeUpuceno, String tekst){
            this.imeObjave=imeObjave;
            this.prezimeObjave = prezimeObjave;
            this.imeUpuceno = imeUpuceno;
            this.prezimeUpuceno = prezimeUpuceno;
            this.tekst = tekst;
    }
    public FacebookPost(){

    }

    public void like() {
        this.brLajkova++;
    }

    public void disLike() {
        if (this.brLajkova > 0) {
            this.brLajkova--;
        }
    }

    public void share() {
        this.brojDeljenja++;
    }

    public void stampaj() {
        System.out.println(this.imeObjave + " " + this.prezimeObjave + ">>>" +
                this.imeUpuceno + " " + this.prezimeUpuceno);
        System.out.println("Objava: " + this.tekst);
        System.out.println("Likes: " + this.brLajkova + " | Shares: " + this.brojDeljenja);
    }

}
//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
// Konstruktore:
//difoltni konstuktor
//konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1
