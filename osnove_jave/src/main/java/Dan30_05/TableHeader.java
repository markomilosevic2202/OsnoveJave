package Dan30_05;

import java.util.ArrayList;

public class TableHeader {
    ArrayList<String> lista = new ArrayList<>();

    public void add(String add) {
        this.lista.add(add);
    }

    public void stampa() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(this.lista.get(i) + "\t\t");
        }
        System.out.println();
    }

}
