package Domaci26_05;

import java.util.ArrayList;

public class History {
         public ArrayList<HistoryPage> lista = new ArrayList<>();

         public void addPage(HistoryPage page){
             lista.add(page);
         }
         public void removPage(String link){
             for (int i = 0; i < lista.size(); i++) {
                 if(this.lista.get(i).getLink().equals(link)){
                     lista.remove(i);
                 }
             }
         }
        public void  removKolace(String link){
            for (int i = 0; i < lista.size(); i++) {
                if(this.lista.get(i).getLink().equals(link)){
                   // this.lista.s
                }
            }
        }


}
