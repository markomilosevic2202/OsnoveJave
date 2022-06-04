package Domaci02_06;

public class Magacioner extends Radnik{

    public Magacioner(String imePrezime) {
        super(imePrezime);
    }

    private double prosecnaPlata(){
        double prosecnaPlata = 0;
        for (int i = 0; i < this.list.size(); i++) {
            prosecnaPlata += this.list.get(i).plata;

        }return prosecnaPlata/this.list.size()*0.5;
    }

    @Override
    public double plata() {

        return prosecnaPlata()*this.list.size();
    }

    @Override
    public void stampaj() {
        System.out.println("Plata magacionera: " + plata());
    }
}
