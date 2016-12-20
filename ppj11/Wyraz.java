package ppj11;

/**
 * Created by bartoszrogowski on 17/12/2016.
 */
public class Wyraz {
    private String wyraz;
    private int x;

    public Wyraz() {
        this.wyraz = "";
        this.x = 0;
    }

    public void dodajZnak(char znak) {
        this.wyraz += znak;
        this.x++;
    }

    public String toString() {
        return this.wyraz;
    }

    public int length() {
        return this.x;
    }
}
