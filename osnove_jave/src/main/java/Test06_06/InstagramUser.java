package Test06_06;

public class InstagramUser {
    private String userName;
    private String imePrezime;

    public InstagramUser(String userName, String imePrezime) {
        this.userName = userName;
        this.imePrezime = imePrezime;
    }

    public InstagramUser(String userName) {
        this.userName = userName;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }


    public String getUserName() {
        return userName;
    }

   public void stampa(){
       System.out.println("@" + this.userName + "\t " + this.imePrezime);

   }
   public String generisiLink(){
      String s = String.join( "/","https://www.instagram.com/",this.userName);
       return s;
   }
}
//username korisnika
//ime i prezime
//konstuktor koji postavlja samo username
//konstuktor koji postavlja sve atribute
//gettere za sve atribute
//settere za sve atribute osim username-a
//metodu za stampu koja stampa podatke korisnika u jednom redu:
//	@username \t ime i prezime
//metodu koja generise link do korisnickog profila.Metoda generise i vraca string u formatu:
//https://www.instagram.com/[username]/
//Npr:za username pera, metoda vraca string https://