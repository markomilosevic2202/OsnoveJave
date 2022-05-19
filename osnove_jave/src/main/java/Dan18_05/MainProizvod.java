package Dan18_05;

public class MainProizvod {
    public static void main(String[] args) {

        Prizvod kupus = new Prizvod();
        kupus.nazivProizvoda = "kupus";
        kupus.cenaProizboda = 130;
        kupus.tezinaProizvoda = 1.78;
        kupus.stampaj(kupus.nazivProizvoda, kupus.cenaProizboda, kupus.tezinaProizvoda);
        System.out.println();

        Prizvod paradajz = new Prizvod();
        paradajz.nazivProizvoda = "paradajz";
        paradajz.cenaProizboda = 280.5;
        paradajz.tezinaProizvoda = 0.98;
        paradajz.stampaj(paradajz.nazivProizvoda, paradajz.cenaProizboda, paradajz.tezinaProizvoda);
    }
}
