package Domaci24_05;

import java.util.ArrayList;

public class MainZeleniKarton {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> lista = new ArrayList<>();
        lista.add(new ZeleniKarton("Dragan Jovanovic" ,15478,  "Biologija", "Dragan Glisic", 6));
        lista.add(new ZeleniKarton("Milam Petrovic" , 154897, "Geografija", "Srdjan jovanovic",8));
        lista.add(new ZeleniKarton("Milutin Sibinovic" , 1477879, "Geografija", "Srdjan jovanovic",9));
        lista.add(new ZeleniKarton("Marko Milosevic" , 168977, "Matematika", "Rade Trajkovic",5));
        lista.add(new ZeleniKarton("Marija Nedeljkovic" , 114566, "Biologija", "Dragan Glisic",10));
        lista.add(new ZeleniKarton("Marica Stankovic" , 145789, "Fizika", "Milutin Milankovic",7));
        lista.add(new ZeleniKarton("Danijela Milojkovic" , 13689, "Fizika", "Milutin Milankovic",5));


        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).stampa();
        }
        double zbirOcena = 0;
        int brPrelaznihOcena = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getOcena()>5){
            zbirOcena = zbirOcena + lista.get(i).getOcena();
            brPrelaznihOcena++;}
        }
        System.out.println("Prosecna ocena polozenih ispita je: "+ zbirOcena/brPrelaznihOcena);




    }

}
