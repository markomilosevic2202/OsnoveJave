package Domaci24_05;

public class Ringla {
    private boolean expres;
    private int jacina;
    private int jacinaGrejaca;

    public Ringla() {
        this.jacina = 0;
    }

    public Ringla(boolean expres, int jacina) {
        this.expres = expres;
        this.jacina = jacina;
    }

    public int getJacina() {
        return jacina;
    }
    private int maxBrPojacavanja(){
       return  (this.expres) ? 12 : 3;
    }
    public void pojacaj(){
        if(maxBrPojacavanja()>this.jacina){
        this.jacina++;}
        else {
            System.out.println("Prekoracili ste limit");
        }
    }
    public void iskljuci(){
        this.jacina = 0;
    }
    public boolean radIliNe(){
        return (this.jacina > 0) ? true : false;
    }
    public double potrosnja(double vremeRada){
        return 100/maxBrPojacavanja()*this.jacina*vremeRada;
    }
    public void stampa(){
        if(radIliNe()){
            System.out.println("Radi");
        }
        else {
            System.out.println("Ne radi");
        }
    }

}
