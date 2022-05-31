package Dan30_05;

import java.util.ArrayList;

public class Table {
    private String header;
    private ArrayList<TableRow> list = new ArrayList<>();

    public void setHeader(String header) {
        this.header = header;
    }

    public void addRow(TableRow row) {
        this.list.add(row);
    }

    public void stampa() {

    }
}
