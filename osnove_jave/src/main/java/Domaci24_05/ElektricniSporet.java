package Domaci24_05;

public class ElektricniSporet {
    private String marka;
    private int garancija;
    private int maxBrRingli;
    private Ringla gl;
    private Ringla gd;
    private Ringla dl;
    private Ringla dd;

    public ElektricniSporet(String marka, int garancija, int maxBrRingli, Ringla gl, Ringla gd, Ringla dl, Ringla dd) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxBrRingli = maxBrRingli;
        this.gl = gl;
        this.gd = gd;
        this.dl = dl;
        this.dd = dd;
    }

    public ElektricniSporet() {
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxBrRingli() {
        return maxBrRingli;
    }

    public Ringla getGl() {
        return gl;
    }

    public Ringla getGd() {
        return gd;
    }

    public Ringla getDl() {
        return dl;
    }

    public Ringla getDd() {
        return dd;
    }

    public void pojacaj(Ringla kojaRingla){
        kojaRingla.pojacaj();
    }
    public void ugasi(Ringla kojaRingla){
        kojaRingla.iskljuci();
    }
    public double racunajPotrosnju(int vremeDd, int vremeDl, int vremeGd, int vremeGl){
        return this.dl.potrosnja(vremeDl) + this.dd.potrosnja(vremeDd) +
                this.gd.potrosnja(vremeGd) + this.gl.potrosnja(vremeGl);
    }
    public void stamaj(){
        System.out.println(this.marka + " - " + this.garancija);
        System.out.println("Gore levo: ");
        this.gl.stampa();
        System.out.println("Gore desno: ");
        this.gd.stampa();
        System.out.println("Dole levo: ");
        this.dl.stampa();
        System.out.println("Donje desno: ");
        this.dd.stampa();
    }
}
