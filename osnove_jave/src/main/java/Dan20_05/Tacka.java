package Dan20_05;

public class Tacka {
    public int x;
    public int y;

    public Tacka(){};
    public Tacka (int x, int y){
         this.x=x;
         this.y = y;
    }
    public void stampa(){
        System.out.println("X je:" + this.x + " Y je: " + this.y);
    }
}
