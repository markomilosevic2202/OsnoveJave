package Dan31_05;

public class Profesor extends Osoba {
    private String predmet;
    private int iznosPlate;

    public Profesor(String imePrezime, String jmbg, String predmet, int iznosPlate) {
        super(imePrezime, jmbg);
        this.predmet = predmet;
        this.iznosPlate = iznosPlate;
    }
    public void povecajPlatu(int povecanje){
        this.iznosPlate = this.iznosPlate + povecanje;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println(this.predmet + " - " + this.iznosPlate);
    }
}
