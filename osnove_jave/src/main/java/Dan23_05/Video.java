package Dan23_05;

public class Video {
    private int idVideo;
    private String naziv;
    private int duzinaVide;
    private int brLike;
    private int brDislike;

    public Video() {
    }

    public Video(int idVideo, String naziv, int duzinaVide, int brLike,
                 int brDislike, int brPregleda) {
        this.idVideo = idVideo;
        this.naziv = naziv;
        this.duzinaVide = duzinaVide;
        this.brLike = brLike;
        this.brDislike = brDislike;
        this.brPregleda = brPregleda;
    }

    private int brPregleda;
    public void like(){
        this.brLike++;
    }
    public void disLike(){
        this.brDislike++;
    }
    public void pregledaj(){
        this.brPregleda++;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzinaVide() {
        return duzinaVide;
    }

    public int getBrLike() {
        return brLike;
    }

    public int getBrDislike() {
        return brDislike;
    }

    public int getBrPregleda() {
        return brPregleda;
    }
}
