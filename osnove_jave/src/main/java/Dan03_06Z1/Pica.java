package Dan03_06Z1;

public class Pica extends Proizvod {
    private double cenaPodloge;

    public Pica() {
    }

    public Pica(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public double getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public double ukupnaCena() {
        return this.cenaPodloge + this.cena();
    }

    @Override
    public void stampa() {
        System.out.println("Pica");
        System.out.println("Sastojci:");
        for (int i = 0; i < this.dodaci.size(); i++) {
            System.out.println(dodaci.get(i).getNazivDodatka());
        }
        System.out.println(this.ukupnaCena());
    }
    }

