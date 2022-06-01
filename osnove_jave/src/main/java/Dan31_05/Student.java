package Dan31_05;

public class Student extends Osoba {
    private String brIndeksa;
    private int dugSkolarina;

    public Student(String imePrezime, String jmbg, String brIndeksa, int dugSkolarina) {
        super(imePrezime, jmbg);
        this.brIndeksa = brIndeksa;
        this.dugSkolarina = dugSkolarina;
    }

   public void umanjiDug(int uplata){
        this.dugSkolarina = this.dugSkolarina - uplata;
   }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println(this.brIndeksa + " " + this.dugSkolarina);
    }
}
