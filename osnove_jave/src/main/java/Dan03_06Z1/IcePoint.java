package Dan03_06Z1;

public class IcePoint extends Proizvod{
    private String tipSladoleda;
    private boolean veliki;

    public IcePoint(String tipSladoleda, boolean veliki) {
        this.tipSladoleda = tipSladoleda;
        this.veliki = veliki;
    }

    public String getTipSladoleda() {
        return tipSladoleda;
    }

    public void setTipSladoleda(String tipSladoleda) {
        this.tipSladoleda = tipSladoleda;
    }

    public boolean isVeliki() {
        return veliki;
    }

    public void setVeliki(boolean veliki) {
        this.veliki = veliki;
    }

    @Override
    public double ukupnaCena() {
        if(veliki){
            return cena()+130;
        }else {
        return cena()+100;
    }}

    @Override
    public void stampa() {
        System.out.println(this.tipSladoleda );
        System.out.println("Sastojci:");
        for (int i = 0; i < this.dodaci.size(); i++) {
            dodaci.get(i).stampa();
        }
        System.out.println(this.ukupnaCena());
    }
}
