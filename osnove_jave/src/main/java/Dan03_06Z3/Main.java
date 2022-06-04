package Dan03_06Z3;

public class Main {
    public static void main(String[] args) {


    Disciplina skok = new Disciplina("Skok u dalj", "s");
    Disciplina trka = new Disciplina("110m sa preponama", "t");
    Skakac s1 = new Skakac("Marko Milosevic", 5);
    Skakac s2 = new Skakac("Dragan Peric", 6);
    Skakac s3 = new Skakac("Jovna Jovanovic", 4);
    skok.dodajDisciplinu(s1);
    skok.dodajDisciplinu(s2);
    skok.dodajDisciplinu(s3);
    skok.prikaziNajboljeg();
}}
