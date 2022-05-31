package Domaci30_05;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String imePrezime;
    private String tipStudenta;
    private ArrayList<Ispit> lista = new ArrayList<>();

    public Student(int brIndeksa, String imePrezime, String tipStudenta) {
        this.brIndeksa = brIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudenta = tipStudenta;
    }

    public Student() {
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudenta() {
        return tipStudenta;
    }

    public void setTipStudenta(String tipStudenta) {
        this.tipStudenta = tipStudenta;
    }

    public ArrayList<Ispit> getLista() {
        return lista;
    }

    public void dodaj(Ispit ispit) {
        this.lista.add(ispit);
    }

    public double prosek() {
        double prosek = 0;
        int brPolozenihIspita = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (this.lista.get(i).getOcena() > 5) {
                prosek = prosek + this.lista.get(i).getOcena();
                brPolozenihIspita++;
            }
        }
        return prosek / brPolozenihIspita;
    }

    public void stampaj() {
        System.out.println("Br indeksa: " + this.brIndeksa + " Ime i Prezime: " + this.imePrezime +
                " Tip studija: " + this.tipStudenta);
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println(this.lista.get(i).getNazivPredmeta() + " - " + this.lista.get(i).getImePrezimeProfesora() +
                    " - " + this.lista.get(i).getOcena());
        }
    }
}
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)