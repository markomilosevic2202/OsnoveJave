package Dan23_05;

public class Vaga {
    private String mernaJedinica;
    private Proizvod2 proizvod;

    public Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod2 getProizvod2() {
        return proizvod;
    }

    public void setProizvod(Proizvod2 proizvod) {
        this.proizvod = proizvod;
    }
    public double sracunajCenu(double tezina){
        if(this.mernaJedinica.equals("lb")){
        return tezina * this.proizvod.getCenaLb();}
        return tezina * this.proizvod.getCenaKg();

}
   public void stampaj(double tezina){
       proizvod.stampa();
       if(this.mernaJedinica.equals("lb")){
       System.out.print("Cena po funti: " + this.proizvod.getCenaLb());}
       else {
           System.out.print("Cena po kilogramu: " + this.proizvod.getCenaKg());

       }
       System.out.println("  " + this.mernaJedinica+ " x " + tezina);
       System.out.println("Ukupno: " + this.sracunajCenu(tezina));
   }
}
