package Dan03_06Z3;

public class Skakac extends Atleticar{
    public Skakac(String imePrezime, double rezultat) {
        super(imePrezime, rezultat);
    }

    @Override
    public boolean bolji(Atleticar a2) {
        if(this.rezultat > a2.rezultat){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void stampa() {
        System.out.println(this.getImePrezime() + " - " + this.rezultat);
    }
}

