package Domaci03_06Z1;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (ambalaze.get(i).getBarkod().equals(barkod)) {
                ambalaze.remove(i);
            }

        }
    }

    private double ceneSaPopustom(SuperKartica superKartica) {
        double cenaSaPopustima = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaSaPopustima += (this.ambalaze.get(i).cenaArtikla() - superKartica.getPopust());
        }
        return cenaSaPopustima;
    }

    public void stampa() {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            System.out.println(this.ambalaze.get(i).nazivArtikla + " - " + this.ambalaze.get(i).cenaArtikla());

        }
    }// zadnju metodu nisam implementirao jer je po meni ista kao i predhodna umesto toga sam stavio metodu za stampanje

}
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.