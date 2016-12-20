package ppj11;

/**
 * Created by bartoszrogowski on 17/12/2016.
 */
public class Wyraz2 {
    private String wyraz;
    private Wyraz2 nastepnyWyraz;

    public Wyraz2(String wyraz) {
        this.wyraz = wyraz;
        this.nastepnyWyraz = null;
    }

    public void setNastepnyWyraz(Wyraz2 nastepnyWyraz) {
        this.nastepnyWyraz = nastepnyWyraz;
    }

    public void show() {
        System.out.print(wyraz + ", ");
        if(this.nastepnyWyraz != null) {
            this.nastepnyWyraz.show();
        }
    }
}
