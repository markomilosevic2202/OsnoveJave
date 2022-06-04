package Domaci02_06;

public class Manager extends Radnik{
    public Manager(String imePrezime) {
        super(imePrezime);
    }

    @Override
    public double plata() {
        double ukupnoPlata = 0;
        for (int i = 0; i < this.list.size(); i++) {
            ukupnoPlata += list.get(i).plata;
        }
      return ukupnoPlata;
    }

    @Override
    public void stampaj() {
        System.out.println("Plata menagera: " + plata());
    }
}
