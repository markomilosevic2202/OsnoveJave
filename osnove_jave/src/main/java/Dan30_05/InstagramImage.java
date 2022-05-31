package Dan30_05;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InstagramTag> lista = new ArrayList<>();
    private String dimenzijaSlike;
    private String putanja;

    public InstagramImage( String dimenzijaSlike, String putanja) {

        this.dimenzijaSlike = dimenzijaSlike;
        this.putanja = putanja;
    }

    public String getDimenzijaSlike() {
        return dimenzijaSlike;
    }

    public void setDimenzijaSlike(String dimenzijaSlike) {
        this.dimenzijaSlike = dimenzijaSlike;
    }

    public String getPutanja() {
        return putanja;
    }

    public void setPutanja(String putanja) {
        this.putanja = putanja;
    }

    public void dodajTag(InstagramTag tag){
        lista.add(tag);
    }
    public void stampaj(){
        System.out.println("Dimenzija slike: " + this.dimenzijaSlike);
        System.out.println("Putanja: " + this.putanja);
        for (int i = 0; i < this.lista.size(); i++) {
            this.lista.get(i).stampaj();

        }
    }


}
