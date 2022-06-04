package Dan02_06Z4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    ArrayList<Figura> f1 = new ArrayList<>();
    f1.add(new Pravougaonik(4,2));
    f1.add(new Pravougaonik(3,1));
    f1.add(new Pravougaonik(2,1)) ;
    f1.add(new JednakostranicniTrougao(4));
    f1.add(new JednakostranicniTrougao(3));
    int sumaObim=0;
        for (int i = 0; i < f1.size(); i++) {
          sumaObim = sumaObim + f1.get(i).obim();
        }
        int sumaPovrsina=0;
        for (int i = 0; i < f1.size(); i++) {
            sumaPovrsina = sumaPovrsina + f1.get(i).povrsina();
        }
        System.out.println(sumaObim + " " + sumaPovrsina);
}
}