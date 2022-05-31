package Dan30_05;

public class InstagramTag {
    private int kordinataX;
    private int kordinataY;
    private InstagramUser user;

    public InstagramTag() {
    }

    public InstagramTag(int kordinataX, int kordinataY, InstagramUser user) {
        this.kordinataX = kordinataX;
        this.kordinataY = kordinataY;
        this.user = user;
    }

    public int getKordinataX() {
        return kordinataX;
    }

    public void setKordinataX(int kordinataX) {
        this.kordinataX = kordinataX;
    }

    public int getKordinataY() {
        return kordinataY;
    }

    public void setKordinataY(int kordinataY) {
        this.kordinataY = kordinataY;
    }

    public InstagramUser getUser() {
        return user;
    }

    public void setUser(InstagramUser user) {
        this.user = user;
    }

    public void stampaj() {
        System.out.println("Kordinate: " + this.kordinataX + " * " + this.kordinataY);
        this.user.stampaj();
    }
}
