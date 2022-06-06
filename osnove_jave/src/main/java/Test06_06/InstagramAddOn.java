package Test06_06;

public abstract class InstagramAddOn {
    protected int id;
    protected int cordinataX;
    protected int cordinataY;
    protected int sirina;
    protected int visina;

    public int getId() {
        return id;
    }

    public int getCordinataX() {
        return cordinataX;
    }

    public int getCordinataY() {
        return cordinataY;
    }

    public int getSirina() {
        return sirina;
    }

    public int getVisina() {
        return visina;
    }

    public InstagramAddOn() {
    }

    public InstagramAddOn(int id, int cordinataX, int cordinataY, int sirina, int visina) {
        this.id = id;
        this.cordinataX = cordinataX;
        this.cordinataY = cordinataY;
        this.sirina = sirina;
        this.visina = visina;
    }
    public abstract int minSirina();
    public abstract int minVisina();

    public void povecajDimenziju(int visina, int sirina){
        this.visina += visina;
        this.sirina += sirina;
    }
    public void smanjiDimenziju(int visina, int sirina){
        if(minSirina() + sirina < this.sirina){
            this.sirina = this.sirina - sirina;
        }else{
            this.sirina = minSirina();
        }
        if(minVisina() + visina < this.sirina){
            this.sirina = this.sirina - sirina;
        }else{
            this.sirina = minSirina();
        }
    }
    public abstract void stampa();
}
//id - jedinstveni identifikator koji moze da bude po zelji broj ili neki tekstualni kod
//x i y koordinatu - sluze da odrede poziciju dodataka u okviru storija
//sirinu dodatka
//visinu dodatka
//getere za sve atribute
//nemamo settere
//konstuktor koji je potreban (potrebno je zakljuciti koji konstruktor jedino ima smisla da postoji)
//apstraktnu metodu koja vraca minimalnu sirinu dodatka
//apstraktnu metodu koja vraca minimalnu visinu dodatka
//metodu za povecanje dimenzija. Metoda prima dva parametra, jedan za povecanje visine a drugi za povecanje sirine dodatka.
//metodu za smanjenje dimenzija.Metoda prima dva parametra, jedan za smanjenje visine a drugi za smanjenje sirine. Duzina i visina ne mogu da spadnu ispod minimalnih vrednosti dodatka.
//apstraktnu metodu za stampu