public class LiczbaZespolona {
    private double rzeczywista;
    private double urojona;

    public LiczbaZespolona (double rzeczywista, double urojona) {
        this.rzeczywista = rzeczywista;
        this.urojona = urojona;
    }

    public LiczbaZespolona dodaj(LiczbaZespolona liczba) {
        this.wyswietl();
        System.out.print(" + ");
        liczba.wyswietl();
        System.out.print(" = ");

        LiczbaZespolona tmp;
        tmp = new LiczbaZespolona(this.rzeczywista +
            liczba.rzeczywista, this.urojona + liczba.urojona);
        tmp.wyswietlln();
        return tmp;
        // this.rzeczywista = tmp.rzeczywista;
        // this.urojona = tmp.urojona;

    }

    public void odejmij(LiczbaZespolona liczba) {

    }

    public void pomnoz(LiczbaZespolona liczba) {
        // LiczbaZespolona tmp = new
        // (this.rzeczywista * liczba.rzeczywista - this.urojona * liczba.urojona)
    }

    public LiczbaZespolona zwieksz() {
        this.rzeczywista++;
        return this;
    }

    public void wyswietl() {
        System.out.print((int)this.rzeczywista + " + " +
            (int)this.urojona + "i");
    }

    public void wyswietlln() {
        System.out.println((int)this.rzeczywista + " + " +
            (int)this.urojona + "i");
    }
}
