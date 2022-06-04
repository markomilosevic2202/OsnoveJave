package Dan02_06Z3;

public class AudioControl extends Control{
    public boolean pojacaj;

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl() {
    }

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (pojacaj && videoPlayer.getJacinaZvuka()<100) {
            videoPlayer.setDuzina(videoPlayer.getTrenutnoVreme() + 1);
        } else {
            if (pojacaj && videoPlayer.getJacinaZvuka()>1) {
                videoPlayer.setDuzina(videoPlayer.getTrenutnoVreme() - 1);
            }
        }
    }
}
