package ppj11;

public class Kwadrat {
    private double bok;

    public Kwadrat(double dlugoscBoku) {
        this.bok = dlugoscBoku;
    }

    public void show() {
        System.out.println("Pole powierzchni tego kwadratu wynosi: "
                + bok * bok);
        System.out.println("Objetosc szescianu zbudowanego na podstawie tego kwadratu wynosi: "
                + bok * bok * bok);
    }

    public Walec przygotujWalec() {
        return new Walec(this.bok/2, this.bok);
    }
}
