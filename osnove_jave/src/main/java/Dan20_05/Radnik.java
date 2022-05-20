package Dan20_05;

public class Radnik {
    public String jmbg;
    public String ime;
    public String prezime;
    public int brojDece;
    public int stepenStrucneSpreme;
    public int godineRadnogStaza;

   public Radnik(String jmbg){

   }
   public Radnik(String jmbg, String ime, String prezime,
                 int brojDece, int stepenStrucneSpreme, int godineRadnogStaza){
       this.jmbg = jmbg;
       this.ime = ime;
       this.prezime = prezime;
       this.brojDece = brojDece;
       this.stepenStrucneSpreme = stepenStrucneSpreme;
       this.godineRadnogStaza = godineRadnogStaza;
   }
   public double minuliRad (){
       double minuliRad = this.godineRadnogStaza;
       if (this.godineRadnogStaza < 10){
           return this.godineRadnogStaza * 0.05;
       }
       else if (this.godineRadnogStaza < 20){
           return 0.5+ (this.godineRadnogStaza-10)*0.075;
       }
       else {
           return (0.5 + 0.75) + (this.godineRadnogStaza - 20) * 0.1;
       }

   }
   public double koeficijentSlozenosti (){
       if (this.stepenStrucneSpreme == 1){
           return 1.03;
       } else if (this.stepenStrucneSpreme ==2) {
           return 1.65;
       } else if (this.stepenStrucneSpreme == 3) {
           return 2.00;
       } else if (this.stepenStrucneSpreme == 4) {
           return 2.27;
       } else if (this.stepenStrucneSpreme == 5) {
           return 2.88;
       }else if (this.stepenStrucneSpreme == 6) {
           return 3.09;
       }else if (this.stepenStrucneSpreme == 7) {
           return 3.40;
       }else  {
           return 4.12;
       }
   }
   public double plata(){
       return 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
   }
   public boolean kreditnoSposoban (){
       if (this.plata()>50000){
           return true;
       }
       return false;
   }
   public int brSlobodnihDana(){
       return 22+(this.brojDece)*2;
   }
}
//jmbg radnika
//ime i prezime
//broj dece (1,2,3,... ili 0 ako nema dece)
//stepen strucne spreme (od 1 do 8)
//godine radnog staza
//konstuktor koji postavlja samo jmbg
//konstuktor koji postavlja sve atribute
//metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000
//metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu godinu.Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2 dana
//
//
//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//- od 10-20 godina 0.075
//- preko 20 godina 0.1