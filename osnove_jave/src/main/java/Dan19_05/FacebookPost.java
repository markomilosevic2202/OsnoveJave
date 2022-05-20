package Dan19_05;

public class FacebookPost {
    String imeObjave;
    String prezimeObjave;
    String imeUpuceno;
    String prezimeUpuceno;
    String tekst;
    int brLajkova;
    int brojDeljenja;

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
