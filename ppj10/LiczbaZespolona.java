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

    public LiczbaZespolona odejmij(LiczbaZespolona liczba) {
        this.wyswietl();
        System.out.print(" - ");
        liczba.wyswietl();
        System.out.print(" = ");

        LiczbaZespolona tmp;
        tmp = new LiczbaZespolona(this.rzeczywista -
            liczba.rzeczywista, this.urojona - liczba.urojona);
        tmp.wyswietlln();
        return tmp;
    }

    public LiczbaZespolona pomnoz(LiczbaZespolona liczba) {
        // mnozenie (ac - bd) + i(ad + bc)
        // a = this.rzeczywista
        // b = this.urojona
        // c = liczba.rzeczywista
        // d = liczba.urojona
        this.wyswietl();
        System.out.print(" * ");
        liczba.wyswietl();
        System.out.print(" = ");

        LiczbaZespolona tmp;
        tmp = new LiczbaZespolona(this.rzeczywista * liczba.rzeczywista -
            this.urojona * liczba.urojona,
            this.rzeczywista * liczba.urojona +
            this.urojona * liczba.rzeczywista);
        tmp.wyswietlln();
        return tmp;
    }

    public LiczbaZespolona zwieksz() {
        this.wyswietl();
        System.out.print(" +  1i = ");
        this.urojona++;
        this.wyswietlln();
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
