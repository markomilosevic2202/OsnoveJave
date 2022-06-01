package Dan31_05Z2;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public VisaKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja, String ovlascenoLice) {
        super(suma, brojKartice, godinaVazenja, mesecVazenja);
        this.ovlascenoLice = ovlascenoLice;
    }


    public VisaKartica(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double skiniSredstva) {
        super.izvrsiTransakciju(skiniSredstva);
        this.suma = this.suma - (suma*1000/18);
    }

    @Override
    public void stampa() {
        System.out.println("Visa Card: ");
        super.stampa();
    }
}
