package Test06_06;

import java.util.ArrayList;

public class InstagramStory {
    private InstagramUser kreator;
    private String linkSwipUp;
    private String linkSlika;
    private ArrayList<InstagramAddOn> dodaci = new ArrayList<>();
    private ArrayList<InstagramUser> pregledali = new ArrayList<>();

    public InstagramStory(InstagramUser kreator, String linkSlika) {
        this.kreator = kreator;
        this.linkSlika = linkSlika;
    }

    public InstagramUser getKreator() {
        return kreator;
    }

    public String getLinkSwipUp() {
        return linkSwipUp;
    }

    public String getLinkSlika() {
        return linkSlika;
    }

    public ArrayList<InstagramAddOn> getDodaci() {
        return dodaci;
    }

    public ArrayList<InstagramUser> getPregledali() {
        return pregledali;
    }

    public void setLinkSwipUp(String linkSwipUp) {
        this.linkSwipUp = linkSwipUp;
    }

    public InstagramStory() {
    }

    public InstagramStory(InstagramUser kreator, String linkSwipUp, String linkSlika) {
        this.kreator = kreator;
        this.linkSwipUp = linkSwipUp;
        this.linkSlika = linkSlika;
    }
    public void dodajDodatak(InstagramAddOn instagramAddOn){
        dodaci.add(instagramAddOn);
    }
    public void brisiDodatak(int idDodatka){
        for (int i = 0; i < this.dodaci.size(); i++) {
            if (this.dodaci.get(i).getId() == idDodatka) {
                this.dodaci.remove(i);
            }
        }

    }
    private boolean pregledano(String userName){
        for (int i = 0; i < this.pregledali.size(); i++) {
            if(this.pregledali.get(i).getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
    public void dodajPregled(InstagramUser instagramUser){
        if (this.pregledano(instagramUser.getUserName())){
            this.pregledali.add(instagramUser);
        }
    }
    public void stampa(){
        System.out.println(this.kreator.getUserName());
        for (int i = 0; i < this.dodaci.size(); i++) {
            this.dodaci.get(i).stampa();

        }
        System.out.print(this.linkSlika);
        if(this.linkSwipUp != null){
            System.out.println(" - " + this.linkSwipUp);
        }
        System.out.println(" Broj Pregleda: " + this.brPregleda()); // implementirana u stampi br pregleda da se ne bi zvao iz maina
    }
    public int brPregleda(){
       return  this.pregledali.size();

    }
    public void stampaPregleda(){
        for (int i = 0; i < this.pregledali.size(); i++) {
            this.pregledali.get(i).stampa();
        }
    }

}
//autor storija- korisnik koji je kreirao stori
//link za swipe up
//link do slike (npr: https://www.instagram.com/p/CecrcPyrPMj/  )
//niz dodataka na stori
//niz korisnika - cuvamo podatke ko je sve pogledao stori
//gettere za sve atribute
//setter samo za swipe up link
//konstuktore koji su vam potrebi
//metodu za dodavanje dodatka na stori
//metodu za brisanje dodatka sa storija. Metodi se prosledjuje id dodatka koji je potrebno izbaciti.
//private metodu koja proverava da li je korisnik sa datim username-om vec pogledao stori. Metoda kao parametar prima username i vraca da li je korisnik pogledao stori ili ne
//metodu pogledaj stori. Metoda kao parametar prima korisnika i dodaje ga u niz korisnika koji su pogledali stori samo ako nije pogledao pre toga
//metodu za postavljanje storia. Metoda stampa autora i niz dodataka. Ukoliko postoji link za swipe up na dnu stampa odstampajte swipe up zajedno sa linkom, ukoliko ne postoji tada se nista ne stampa
//metodu koja vraca broj pregleda
//metodu koja stampa sve korisnike koji su pogledali stori u formatu: