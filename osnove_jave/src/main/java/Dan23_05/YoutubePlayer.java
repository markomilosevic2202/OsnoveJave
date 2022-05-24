package Dan23_05;

public class YoutubePlayer {
       private Video video ;
       private int kvalitet;
       private String rezim;
       private int jacinaZvuka;
       private int trenutnoVreme;

    public YoutubePlayer() {
        this.kvalitet = 144;
        this.jacinaZvuka = 75;
        this.rezim = "Mini player";
    }
    public void ucitajVideo(){
        this.trenutnoVreme = 0;
       this.video.pregledaj();
    }
    public void pojacaj(){
        if(this.jacinaZvuka<90){
        this.jacinaZvuka = this.jacinaZvuka + 10;
    }
        else {
            this.jacinaZvuka = 100;
        }}
        public void smanj(){
            if(this.jacinaZvuka>10){
                this.jacinaZvuka = this.jacinaZvuka - 10;
            }
            else {
                this.jacinaZvuka = 0;
            }
    }
    public void postavi (int brzina){
        if(brzina<2){
            this.kvalitet = 144;
        } else if (brzina<4) {
            this.kvalitet = 240;
        }else if (brzina<6) {
            this.kvalitet = 360;
        }else if (brzina<8) {
            this.kvalitet = 720;
        }else if (brzina>8) {
            this.kvalitet = 1080;
        }

    }
    public void aktivirijajMini(){
        this.rezim = "MiniPlayer";
    }
    public void aktivirajBioskop(){
        this.rezim= "BioskopMod";
    }
    public void aktivirajCeoEkran(){
        this.rezim = "CeoEkran";
    }
    public void premotajUnapred(){
        if(video.getDuzinaVide()> this.trenutnoVreme + 10){
        this.trenutnoVreme= this.trenutnoVreme + 10;}
     else {this.trenutnoVreme = video.getDuzinaVide();}}

    public void premotajUnazad(){
        if(this.trenutnoVreme > 10){
            this.trenutnoVreme= this.trenutnoVreme - 10;}
        else {this.trenutnoVreme = 0;}}

    public void iscrtajZvuk(){
        if(this.jacinaZvuka == 0){
            System.out.println("</");
        }else{
        for (int i = 0; i < (this.jacinaZvuka / 10); i++) {
            System.out.print("| ");}
            System.out.println();
        }
    }
    public void iscrtajRezim(){
        if (this.rezim.equals("MiniPlayer")){
            System.out.println("[]");
        } else if (this.rezim.equals("BioskopMod")) {
            System.out.println("[..]");
        }else if (this.rezim.equals("CeoEkran")) {
            System.out.println("[||||]");
    }}
    public void iscrtajTrenutnoVreme(){
        System.out.println(this.video.getDuzinaVide()/60 + " : " + this.video.getDuzinaVide()%60);
        System.out.println(this.trenutnoVreme / 60 + " : " + this.trenutnoVreme%60);

    }
    public void iscrtajTimeLine(){
        for (int i = 0; i < (this.trenutnoVreme * 100 / this.video.getDuzinaVide()) ; i++) {
            System.out.println("*");

        }
        for (int i = 0; i < 100 - (this.trenutnoVreme * 100 / this.video.getDuzinaVide()); i++) {
            System.out.println(".");
        }
    }
    public void iscrtaj(){
        this.iscrtajTrenutnoVreme();
        this.iscrtajZvuk();
        this.iscrtajTimeLine();
        System.out.println("Kvalitet: " + this.kvalitet);
        this.iscrtajRezim();
        System.out.println("Naziv: " + this.video.getNaziv());
        System.out.println("Likes: " + this.video.getBrLike() + " | Dislikes: " + this.video.getBrDislike());
        System.out.println(this.video.getBrPregleda() + " Pregleda");
    }
    public String shere(){
        //return String link;
    }

}

