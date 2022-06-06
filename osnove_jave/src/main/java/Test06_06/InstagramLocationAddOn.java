package Test06_06;

public class InstagramLocationAddOn extends InstagramAddOn{
    private String nazivLokacije;

    public InstagramLocationAddOn(int id, int cordinataX, int cordinataY, int sirina, int visina, String nazivLokacije) {
        super(id, cordinataX, cordinataY, sirina, visina);
        this.nazivLokacije = nazivLokacije;
    }

    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    @Override
    public int minSirina() {
        return 100;
    }

    @Override
    public int minVisina() {
        return 50;
    }

    @Override
    public void stampa() {
        System.out.println("x: " + this.cordinataX + " y: " + this.cordinataY + " - " + this.nazivLokacije);
    }
}
//naziv lokacije
//konstuktor koji je potreban
//getter i setter za lokaciju
//minimalna visina za lokaciju je 50 a duzina 100
//stampanje se vrsi u formatu:
//[x, y] (visina, sirina) L naziv lokacije