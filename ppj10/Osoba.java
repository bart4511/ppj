class Osoba {
    String imie;
    String nazwisko;
    int rokUrodzenia;

    public Osoba() {
        imie = "Jan";
        nazwisko = "Kowalski";
        rokUrodzenia = 1950;
    }

    void show() {
        System.out.println("Imie = " + this.imie);
        System.out.println("Nazwisko = " + nazwisko);
        System.out.println("Rok urodzenia = " + rokUrodzenia);
    }
}
