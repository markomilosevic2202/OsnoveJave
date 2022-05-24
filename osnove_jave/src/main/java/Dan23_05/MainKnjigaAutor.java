package Dan23_05;

public class MainKnjigaAutor {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setIme("Dobrica");
        autor1.setPrezime("Cosic");
        Knjiga knjiga1 = new Knjiga();
        knjiga1.setAutor(autor1);
        knjiga1.setIsbn("SGDS");
        knjiga1.setGodinaIzdanja(1987);
        knjiga1.setNaziv("Koreni");
        knjiga1.stampa();
        System.out.println();
        Autor autor2 = new Autor("Borislav", "Pekic");
        Knjiga knjiga2 = new Knjiga("DFDGG", "Zlatno runo", 1965, autor2);
        knjiga2.stampa();
    }
}
