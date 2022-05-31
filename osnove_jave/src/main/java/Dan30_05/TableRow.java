package Dan30_05;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> lista = new ArrayList<>();

    public void dodaj(String row) {
        this.lista.add(row);
    }

    public void stampaj() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(this.lista.get(i) + "\t\t");
        }
    }
}
