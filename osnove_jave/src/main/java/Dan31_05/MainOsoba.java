package Dan31_05;

public class MainOsoba {
    public static void main(String[] args) {


    Student student1 = new Student("Marko Milosevic", "45656565","444554",5000);
    Student student2 = new Student("Milena Djordjevic", "32365","435454",10000);
    Profesor prof1 = new Profesor("Milan Mitic", "245565646464", "Biologija", 500000);
    Profesor prof2 = new Profesor("Dragan Jovanovic", "43226564", "Istorija", 600000);
    student1.stampa();
    student2.umanjiDug(1000);
    student2.stampa();
    prof1.stampa();
    prof2.povecajPlatu(1000);
    prof2.stampa();
}}
