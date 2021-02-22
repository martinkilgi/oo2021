import java.lang.Math;

public class Mangija {
    LiikuvObjekt lobj;
    double tuuletakistus;

    public Mangija(double x, double y, double dx, double dy, double tuulet) {
        lobj = new LiikuvObjekt(x, y, dx, dy);
        tuuletakistus = tuulet;
    }
    public void looPalli(Pall obj) {
        Vektor palliKoht = obj.lobj.asukoht;
        Vektor mangijaKoht = this.lobj.asukoht;
        double dx = palliKoht.x - mangijaKoht.x;
        double dy = palliKoht.y - mangijaKoht.y;
        if(Math.abs(dx) <= 3 && Math.abs(dy) <= 3) {
            obj.liigu(5);
            System.out.println("Mängija lõi palli!");
       } else {
           System.out.println("Mängija on pallist liiga kaugel, et seda lüüa!");
       }
    }
    public void liigu(double sek) {
        lobj.liigu(sek);
        lobj.kiirus = lobj.kiirus.korruta(Math.pow(tuuletakistus, sek));

    }
    public String toString() {
        return "Mängija "+lobj;
    }
}