package Dan02_06Z3;

public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(10, 15, 15, 300);
       videoPlayer.stampa();
        AudioControl audioControl = new AudioControl(true);
        audioControl.izvrsiAkciju(videoPlayer);
        videoPlayer.stampa();
    }
}
