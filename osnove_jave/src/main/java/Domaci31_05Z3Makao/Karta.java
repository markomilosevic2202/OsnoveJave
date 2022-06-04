package Domaci31_05Z3Makao;

public class Karta {
    private int vrednostKarte;
    private String znak;

    public Karta() {
    }

    public Karta(int vrednostKarte, String znak) {
        this.vrednostKarte = vrednostKarte;
        this.znak = znak;
    }

    public int getVrednostKarte() {
        return vrednostKarte;
    }

    public void setVrednostKarte(int vrednostKarte) {
        this.vrednostKarte = vrednostKarte;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }
    public void stampa(){
        if(this.vrednostKarte<11){
        System.out.print(this.vrednostKarte);
    } else if (this.vrednostKarte == 11) {
            System.out.print("A");
        } else if (this.vrednostKarte == 12) {
            System.out.print("J");
        } else if (this.vrednostKarte == 13) {
            System.out.print("Q");

        }
        else {
            System.out.print("K");
        }
        if(this.znak.equals("koro")){
            System.out.print("<>");
        } else if (this.znak.equals("pik")) {
            System.out.print("^");
        } else if (this.znak.equals("herts")) {
            System.out.print("<3");
        }else {
            System.out.print("***");
        }
        System.out.println();

    }
    public boolean poklopiKartu(int broj, String znak){
        if(this.vrednostKarte == broj || this.znak.equals(znak)){
            return true;
        }else {
            return false;
        }
    }
    }
