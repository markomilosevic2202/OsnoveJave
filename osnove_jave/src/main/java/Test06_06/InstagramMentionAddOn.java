package Test06_06;

public class InstagramMentionAddOn extends InstagramAddOn{
    private InstagramUser user;

    public InstagramMentionAddOn(int id, int cordinataX, int cordinataY, int sirina, int visina, InstagramUser user) {
        super(id, cordinataX, cordinataY, sirina, visina);
        this.user = user;
    }

    public InstagramUser getUser() {
        return user;
    }

    public void setUser(InstagramUser user) {
        this.user = user;
    }

    @Override
    public int minSirina() {
          return 80;
    }

    @Override
    public int minVisina() {
        return 50;
    }

    @Override
    public void stampa() {
        System.out.println("x: " + this.cordinataX + " y: " + this.cordinataY +
                           " @" +this.user.getUserName() + "/" + this.user.generisiLink());
    }
}
//korisnika koji je tagovan
//konstuktor koji je potreban
//getter i setter za tagovanog korisnika
//minimalna visina za lokaciju je 50 a duzina 80
//stampanje se vrsi u formatu:
//[x, y] (visina, sirina) @username/link do korisnickog profila