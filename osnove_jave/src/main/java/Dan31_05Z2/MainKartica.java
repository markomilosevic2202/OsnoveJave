package Dan31_05Z2;

public class MainKartica {
    public static void main(String[] args) {


    VisaKartica visa1 = new VisaKartica(5000, "170-225447-221", 2025,11,"Dragan Jovanovic");
    MasterKartica master1 = new MasterKartica(50000,"14-154412-221", 2026, 10);
    visa1.stampa();
    master1.stampa();
}}
