package Domaci30_05;

public class MainIspit {
    public static void main(String[] args) {
        Student student1 = new Student(15474, "Marko Milosevic", "Osnovne");
        Student student2 = new Student(15466, "Milan Djoredjevic", "Master");
        student1.dodaj(new Ispit("Biologija", 6, "Cvetko Nenadic"));
        student1.dodaj(new Ispit("Geografija", 8, "Mile Ilic"));
        student2.dodaj(new Ispit("Geografija", 5, "Mile Ilic"));
        student2.dodaj(new Ispit("Istorija", 8, "Srdjan Novakovic"));

        student1.stampaj();
        System.out.println("Prosek: " + student1.prosek());
        student2.stampaj();
        System.out.println("Prosek: " + student2.prosek());

    }
}