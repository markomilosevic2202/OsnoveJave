package Dan13_05;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String unos = "а";
        while (!unos.equals("Hvala")){
            System.out.println("Unesite zahtev:");
            unos = s.nextLine();
            if (unos.contains("milim te")){
                System.out.println("Dogovoreno");
            }


        }
        System.out.println("Cao");
    }}

//Napisati program koji uci korisnika da kaze “Molim te”. Program od korisnika ucitava zahteve koje treba da
// izvrsi ali jedino reaguje ukoliko korisnik lepo zamoli ( u zahtevu unese “Molim te”). Ukoliko korisnik unese
// zahtev u vidu naredjivanja, program ne reaguje na takve zahteve tj. nista ne ispisuje, a ukoliko korisnik
// zamoli tada program ispisuje “Dogovoreno!”. Program radi dok korisnik ne unese “Hvala!”. Na kraju programa
// ispisati “Cao”
//Commitujte zadatak i push-ujte na github, sa porukom “Domaci 13.05.2022 Zadatak 4”. Za ovaj zadatak trebace vam nextLine metoda sa scannerom.
//Primer izvrsenja:
//Unesite zahtev: Molim te, podseti me sutra da kupim sapun.
//Dogovoreno!
//Unesite zahtev: Podseti me sutra i za sampon.
//Unesite zahtev: Molim te, podseti me da se zahvalim Vladi sto sam poginuo veceras sam sa gitom :’
//Dogovoreno!
//Unesite zahtev: Hvala!
//Cao