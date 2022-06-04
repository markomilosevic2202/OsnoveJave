package Dan02_06Z3;

public class QualityOptimizerControl extends Control{
    private int brzina;

    public QualityOptimizerControl(int brzina) {
        this.brzina = brzina;
    }

    public QualityOptimizerControl() {
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
                videoPlayer.setKvalitetVidea(this.brzina * 5);
    }
}
