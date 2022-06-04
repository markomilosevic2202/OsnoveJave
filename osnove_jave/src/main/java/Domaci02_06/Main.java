package Domaci02_06;

public class Main {
    public static void main(String[] args) {
        Sektor s1 = new Sektor("Proizvodnja" , 65000);
        Sektor s2 = new Sektor("Komerciala" , 80000);
        Sektor s3 = new Sektor("Magacin", 60000);
        Magacioner mag1 = new Magacioner("Pera Peric");
        Manager man1 = new Manager("Mika Mikic");
        mag1.zaposliUSektoru(s1);
        mag1.zaposliUSektoru(s3);
        man1.zaposliUSektoru(s1);
        man1.zaposliUSektoru(s2);
        man1.zaposliUSektoru(s3);
        mag1.stampaj();
        man1.stampaj();
        // ja sam samoinicijativ
    }
}
