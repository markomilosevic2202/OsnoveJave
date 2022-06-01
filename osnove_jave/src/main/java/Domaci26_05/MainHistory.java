package Domaci26_05;

public class MainHistory {
    public static void main(String[] args) {
        History history1 = new History();
        history1.addPage(new HistoryPage("youtube", "www.a" , 14, 50,"mile", "golja"));
        history1.addPage(new HistoryPage("facebook", "www.b" , 14, 50,"mile", "golja"));
        history1.addPage(new HistoryPage("instagram", "www.c" , 14, 50,"mile", "golja"));
history1.stampa();
history1.removPage("www.b");
        System.out.println();
history1.stampa();
    }
}
