package Domaci26_05;

import java.util.ArrayList;

public class FaceBookPost {
    private String imePrezimeZid;
    private  String tekst;

    public FaceBookPost(String imePrezimeZid, String tekst) {
        this.imePrezimeZid = imePrezimeZid;
        this.tekst = tekst;

    }

    private ArrayList<Reakcija> list= new ArrayList<>();
    public void dodajReakciju(Reakcija reakcija){
        for (int i = 0; i < list.size(); i++) {
            if(this.list.get(i).getImePrezime().equals(reakcija.getImePrezime())){
                this.list.remove(i);
            }
        }
        list.add(reakcija);
    }
    private int brReakcija(String tip){
        int brReakcija = 0;
        for (int i = 0; i < list.size(); i++) {
            if(tip.equals(this.list.get(i).getReakcija())){
                brReakcija++;
            }
        }
        return brReakcija;
    }
    public void stampa(){
        System.out.println(this.imePrezimeZid);
        System.out.println(this.tekst);
        System.out.println("Smajli: " + brReakcija("Smajli")+ " | Like: " + brReakcija("Like") +
                            " | Srce: " + brReakcija("Srce"));
    }
}
