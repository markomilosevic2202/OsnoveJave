package Dan19_05;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod paradajz = new Proizvod();
        paradajz.naziv = "Paradajz";
        paradajz.tezina = 400;
        paradajz.cena = 285.9;
        paradajz.stampaj();
        paradajz.povecajCenu(4);
        System.out.println("Nova cena posle povecanja je " + paradajz.cena);
        System.out.println("Cena sa popustom " + paradajz.vratiCenuSaPopustom(20));
        System.out.println("Postarina je " + paradajz.racunajPostarinu());
        System.out.println();
        Proizvod krastavac = new Proizvod();
        krastavac.naziv = "Krastavac";
        krastavac.tezina = 100;
        krastavac.cena = 99.9;
        krastavac.stampaj();
        krastavac.povecajCenu(4);
        System.out.println("Nova cena posle povecanja je " + krastavac.cena);
        System.out.println("Cena sa popustom " + krastavac.vratiCenuSaPopustom(50));
        System.out.println("Postarina je " + krastavac.racunajPostarinu());
    }
}
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.