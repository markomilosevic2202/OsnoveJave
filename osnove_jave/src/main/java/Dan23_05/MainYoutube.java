package Dan23_05;

public class MainYoutube {
    public static void main(String[] args) {
        YoutubePlayer player = new YoutubePlayer();
        player.iscrtajPlayer();
        Video video1 = new Video(121, "Ko to tamo peva", 4550, 5, 2, 100);
        player.ucitajVideo(video1);
        player.iscrtajPlayer();
        System.out.println();
        System.out.println();
        player.pojacaj();
        player.pojacaj();
        player.pojacaj();
        player.postavi(6);
        player.aktivirajBioskop();
        player.setTrenutnoVreme(2000); //premotavam ga na sredinu da bi se lepo videla timeline
        player.premotajUnapred();
        player.premotajUnapred();
        player.premotajUnazad();
        video1.pregledaj();
        video1.like();
        video1.like();
        video1.disLike();
        player.iscrtajPlayer();
        System.out.println("Link: " + player.shere());
    }
}
