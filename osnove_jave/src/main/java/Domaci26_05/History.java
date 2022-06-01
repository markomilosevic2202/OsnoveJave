package Domaci26_05;

import java.util.ArrayList;

public class History {
    public ArrayList<HistoryPage> lista = new ArrayList<>();

    public void addPage(HistoryPage page) {
        lista.add(page);
    }

    public void removPage(String link) {
        for (int i = this.lista.size(); i > 0; i--) {
            if (this.lista.get(i).getLink().equals(link)) {
                this.lista.remove(i);
            }
        }
    }

    public void obrisiKolaca(String link) {
        for (int i = this.lista.size(); i > 0; i--) {
            if (this.lista.get(i).getLink().equals(link)) {
                this.lista.get(i).obrisiKolacice();
            }
        }
    }

    public void obrisiIstoriju() {
        this.lista.clear();
    }

    public void sacuvajKredenciju(String user, String pass) {
        this.lista.get(0).kredencijale(user, pass);
    }

    public void stampa() {
        for (int i = 0; i < this.lista.size(); i++) {
            lista.get(i).stampaj();
        }
    }

    public void brisiSveKredencijale() {
        for (int i = 0; i < this.lista.size(); i++) {
            this.lista.get(i).obrisiKolacice();
        }
    }

    public void brisiZadnjiSat(int sati, int minuti) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getSatOtvaranja() == sati) ;
        }
    }


}
