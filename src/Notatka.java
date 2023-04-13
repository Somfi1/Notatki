public class Notatka {
    private static int liczbaNotatek = 0;
    private int id;
    private String tytul;
    private String tresc;

    public Notatka(String tytul, String tresc) {
        liczbaNotatek++;
        id = liczbaNotatek;
        this.tytul = tytul;
        this.tresc = tresc;
    }
}
