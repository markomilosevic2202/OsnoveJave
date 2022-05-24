package Dan23_05;

public class MainVaga {
    public static void main(String[] args) {



    Proizvod2 proizvod1 = new Proizvod2(454, "Banane", 149.99);
    Vaga vaga1 = new Vaga();
    vaga1.setProizvod(proizvod1);
    vaga1.setMernaJedinica("lb");
    vaga1.stampaj(4.2);
        System.out.println();
        System.out.println();
    Proizvod2 proizvod2 = new Proizvod2(484,"Mandarine", 100);
    Vaga vaga2 = new Vaga();
    vaga2.setMernaJedinica("kg");
    vaga2.setProizvod(proizvod2);
    vaga2.stampaj(3.5);




}}
