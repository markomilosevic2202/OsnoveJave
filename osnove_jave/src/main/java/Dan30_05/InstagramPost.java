package Dan30_05;

import java.util.ArrayList;

public class InstagramPost {
    private ArrayList<InstagramImage> list = new ArrayList<>();
    private String opis;

    public void dodajSliku(InstagramImage slika) {
        list.add(slika);
    }

    public void stampaj() {
        for (int i = 0; i < this.list.size(); i++) {
            this.list.get(i).stampaj();
        }
    }
}
