package Dan31_05;

public class Osoba {
    protected String imePrezime;
    protected String jmbg;

    public Osoba(String imePrezime, String jmbg) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }

    public Osoba() {
    }

    public void stampa(){
        System.out.println(this.imePrezime + " - " + this.jmbg);
    }
}
