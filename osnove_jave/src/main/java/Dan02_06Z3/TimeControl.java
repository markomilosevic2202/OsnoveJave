package Dan02_06Z3;

public class TimeControl extends Control {
    private boolean napred;

    public TimeControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (napred && videoPlayer.getDuzina()> videoPlayer.getTrenutnoVreme()+15) {
            videoPlayer.setDuzina(videoPlayer.getTrenutnoVreme() + 15);
        } else {
            if (napred && videoPlayer.getTrenutnoVreme() -15 < 0) {
                videoPlayer.setDuzina(videoPlayer.getTrenutnoVreme() - 15);
            }
        }
    }

}