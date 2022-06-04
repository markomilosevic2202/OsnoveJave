package Dan02_06Z4;

public abstract class Figura {
    public Figura() {
    }

    public abstract int povrsina();
    public   abstract int obim();
    public void stampa(){
        System.out.println("Povrsina je:" );
        this.povrsina();
        System.out.println("Obim je " );
        this.obim();
    }
}
